# Simple Java Calculator

Welcome to our first Java calculator project! The goal is to create a simple calculator that can perform basic arithmetic operations such as addition, subtraction, multiplication, and division, with proper exception handling for division by zero.

## Description

This project involves creating a simple calculator application in Java. The calculator will support the following operations:
- Addition
- Subtraction
- Multiplication
- Division (with exception handling for division by zero)

Your task is to implement the main logic in the `SimpleCalculator.java` file. We've provided a basic structure, and your job is to write the body of the functions.

## Step 1: Basic Arithmetic Operations

### Add
- `add(double a, double b)`: This function takes two double parameters, `a` and `b`, and returns their sum.
    - Example: `add(3, 5)` should return `8`.

### Subtract
- `subtract(double a, double b)`: This function takes two double parameters, `a` and `b`, and returns the result of subtracting `b` from `a`.
    - Example: `subtract(10, 4)` should return `6`.

### Multiply
- `multiply(double a, double b)`: This function takes two double parameters, `a` and `b`, and returns their product.
    - Example: `multiply(7, 6)` should return `42`.

### Divide
- `divide(double a, double b)`: This function takes two double parameters, `a` and `b`, and returns the result of dividing `a` by `b`. If `b` is 0, it should return an error message indicating that division by zero is not allowed.
    - Example: `divide(20, 4)` should return `5`.
    - Exception Handling: If `b` is 0, return a message such as `"Error: Division by zero is not allowed."`

## Example Usage

After implementing the functions, your program should handle user inputs to perform these operations. Ensure that you include exception handling for division by zero.

## Getting Started

1. **Clone the repository**: Start by cloning the repository to your local machine.
   ```sh
   $ git clone https://github.com/your-username/simple_calculator.git
   $ cd simple-java-calculator
   ```

2. **Compile the program**: Open a command prompt or terminal, navigate to the directory where the file is saved, and compile the program using the following command:
   ```sh
   $ javac SimpleCalculator.java
   ```

3. **Run the program**: After compilation, run the program with the following command:
   ```sh
   $ java SimpleCalculator
   ```

4. **Input and Output**: Follow the prompts to enter two numbers and an operation (`+`, `-`, `*`, or `/`). The program will display the result of the operation.

