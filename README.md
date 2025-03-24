# Simple Unit Converter Calculator

## Overview
This is a simple unit converter calculator written in Python. It provides functionality to convert between various units of measurement, including temperature, distance, and weight.

## Features
- Convert Celsius to Fahrenheit and vice versa
- Convert Kilometers to Miles and vice versa
- Convert Kilograms to Pounds and vice versa
- User-friendly command-line interface
- Cross-platform compatibility (Windows, Linux, macOS)

## Installation
To run this script, you need to have Python installed on your system.

### Prerequisites
- Python 3.x

### Running the Program
1. Clone this repository or download the script.
2. Open a terminal or command prompt.
3. Navigate to the directory where the script is located.
4. Run the script using the command:
   ```sh
   python unit_converter.py
   ```

## Usage
After running the script, a menu will be displayed where you can choose the conversion type by entering the corresponding number. Follow the prompts to enter the values, and the program will return the converted value.

### Example Conversions
#### Celsius to Fahrenheit
```
Enter temperature in Celsius: 25
Fahrenheit: 77.0
```
#### Kilometers to Miles
```
Enter distance in Kilometers: 10
Miles: 6.21371
```
#### Kilograms to Pounds
```
Enter weight in Kilograms: 5
Pounds: 11.0231
```

## Functions
### OS Identifier
```python
# Function to get the name of the operating system
def get_os():
    return platform.system()
```

```python
# Function to clear the terminal screen based on the OS
def clear_screen():
    if get_os() == "Windows":
        os.system("cls")  # Clear screen for Windows
    else:
        os.system("clear")  # Clear screen for Linux/macOS
```

### Conversion Functions
```python
# Convert temperature from Celsius to Fahrenheit
def celsius_to_fahrenheit(celsius):
    return (celsius * 9/5) + 32
```

```python
# Convert temperature from Fahrenheit to Celsius
def fahrenheit_to_celsius(fahrenheit):
    return (fahrenheit - 32) * 5/9
```

```python
# Convert distance from Kilometers to Miles
def kilometers_to_miles(kilometers):
    return kilometers * 0.621371
```

```python
# Convert distance from Miles to Kilometers
def miles_to_kilometers(miles):
    return miles / 0.621371
```

```python
# Convert weight from Kilograms to Pounds
def kilograms_to_pounds(kilograms):
    return kilograms * 2.20462
```

```python
# Convert weight from Pounds to Kilograms
def pounds_to_kilograms(pounds):
    return pounds / 2.20462
```

## License
This project is open-source and available under the MIT License.

## Author
- Created on: 03/24/2025
- Developer: sycinue-rdc

