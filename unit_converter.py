# Simple Unit Converter Calculator
# Date Created : 03/24/2025

# OS Identifier
import os
import platform

def get_os():
    return platform.system()

def clear_screen():
    if get_os() == "Windows":
        os.system("cls")
    else:
        os.system("clear")

# Program Functions
def celsius_to_fahrenheit(celsius):
    return (celsius * 9/5) + 32

def fahrenheit_to_celsius(fahrenheit):
    return (fahrenheit - 32) * 5/9

def kilometers_to_miles(kilometers):
    return kilometers * 0.621371

def miles_to_kilometers(miles):
    return miles / 0.621371

def kilograms_to_pounds(kilograms):
    return kilograms * 2.20462

def pounds_to_kilograms(pounds):
    return pounds / 2.20462

def main():
    while True:
        clear_screen()
        print("Unit Converter\n")
        print("1. Celsius to Fahrenheit")
        print("2. Fahrenheit to Celsius")
        print("3. Kilometers to Miles")
        print("4. Miles to Kilometers")
        print("5. Kilograms to Pounds")
        print("6. Pounds to Kilograms")
        print("q. Exit the program")
        
        choice = input("\nEnter your choice (1-6 or q): ")
        clear_screen()
    
        if choice == "1":
            print("Celsius to Fahrenheit\n")
            value = float(input("Enter temperature in Celsius: "))
            print("Fahrenheit:", celsius_to_fahrenheit(value))
        elif choice == "2":
            print("Fahrenheit to Celsius\n")
            value = float(input("Enter temperature in Fahrenheit: "))
            print("Celsius:", fahrenheit_to_celsius(value))
        elif choice == "3":
            print("Kilometers to Miles\n")
            value = float(input("Enter distance in Kilometers: "))
            print("Miles:", kilometers_to_miles(value))
        elif choice == "4":
            print("Miles to Kilometers\n")
            value = float(input("Enter distance in Miles: "))
            print("Kilometers:", miles_to_kilometers(value))
        elif choice == "5":
            print("Kilograms to Pounds\n")
            value = float(input("Enter weight in Kilograms: "))
            print("Pounds:", kilograms_to_pounds(value))
        elif choice == "6":
            print("Pounds to Kilograms\n")
            value = float(input("Enter weight in Pounds: "))
            print("Kilograms:", pounds_to_kilograms(value))
        elif choice.lower() == "q":
            print("Exiting the program...")
            break
        else:
            print("Invalid choice! Please select a valid option.")
        
        input("\nPress Enter to continue...")

if __name__ == "__main__":
    main()
