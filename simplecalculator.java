import java.util.Scanner;
public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter the first number: ");
            double num1 = Double.parseDouble(scanner.nextLine());
            
            System.out.print("Enter the second number: ");
            double num2 = Double.parseDouble(scanner.nextLine());
            
            System.out.print("Enter the operator (+, -, *, /): ");
            char operator = scanner.nextLine().charAt(0);
            
            double result = 0;
            
            switch (operator) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    if (num2 == 0) {
                        throw new ArithmeticException("Cannot divide by zero");
                    }
                    result = num1 / num2;
                    break;
                default:
                    throw new IllegalArgumentException("Invalid operator");
            }
            
            System.out.println("The result is: " + result);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter valid numbers.");
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}
