import java.util.Scanner;

public class UnitConverter {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            clearScreen();
            System.out.println("Unit Converter\n");
            System.out.println("1. Celsius to Fahrenheit");
            System.out.println("2. Fahrenheit to Celsius");
            System.out.println("3. Kilometers to Miles");
            System.out.println("4. Miles to Kilometers");
            System.out.println("5. Kilograms to Pounds");
            System.out.println("6. Pounds to Kilograms");
            System.out.println("q. Exit the program");
            
            System.out.print("\nEnter your choice (1-6 or q): ");
            String choice = scanner.nextLine().trim();
            
            if (choice.equalsIgnoreCase("q")) {
                System.out.println("Exiting the program...");
                break;
            }

            clearScreen();
            try {
                switch (choice) {
                    case "1":
                        System.out.println("Celsius to Fahrenheit\n");
                        System.out.print("Enter temperature in Celsius: ");
                        double celsius = Double.parseDouble(scanner.nextLine());
                        System.out.println("Fahrenheit: " + celsiusToFahrenheit(celsius));
                        break;
                    case "2":
                        System.out.println("Fahrenheit to Celsius\n");
                        System.out.print("Enter temperature in Fahrenheit: ");
                        double fahrenheit = Double.parseDouble(scanner.nextLine());
                        System.out.println("Celsius: " + fahrenheitToCelsius(fahrenheit));
                        break;
                    case "3":
                        System.out.println("Kilometers to Miles\n");
                        System.out.print("Enter distance in Kilometers: ");
                        double kilometers = Double.parseDouble(scanner.nextLine());
                        System.out.println("Miles: " + kilometersToMiles(kilometers));
                        break;
                    case "4":
                        System.out.println("Miles to Kilometers\n");
                        System.out.print("Enter distance in Miles: ");
                        double miles = Double.parseDouble(scanner.nextLine());
                        System.out.println("Kilometers: " + milesToKilometers(miles));
                        break;
                    case "5":
                        System.out.println("Kilograms to Pounds\n");
                        System.out.print("Enter weight in Kilograms: ");
                        double kilograms = Double.parseDouble(scanner.nextLine());
                        System.out.println("Pounds: " + kilogramsToPounds(kilograms));
                        break;
                    case "6":
                        System.out.println("Pounds to Kilograms\n");
                        System.out.print("Enter weight in Pounds: ");
                        double pounds = Double.parseDouble(scanner.nextLine());
                        System.out.println("Kilograms: " + poundsToKilograms(pounds));
                        break;
                    default:
                        System.out.println("Invalid choice! Please select a valid option.");
                        break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Invalid input! Please enter a valid number.");
            }
            
            System.out.println("\nPress Enter to continue...");
            scanner.nextLine();
        }
    }

    private static void clearScreen() {
        try {
            if (System.getProperty("os.name").contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                System.out.print("\033[H\033[2J");
                System.out.flush();
            }
        } catch (Exception ignored) {}
    }

    private static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9/5) + 32;
    }

    private static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5/9;
    }

    private static double kilometersToMiles(double kilometers) {
        return kilometers * 0.621371;
    }

    private static double milesToKilometers(double miles) {
        return miles / 0.621371;
    }

    private static double kilogramsToPounds(double kilograms) {
        return kilograms * 2.20462;
    }

    private static double poundsToKilograms(double pounds) {
        return pounds / 2.20462;
    }
}
