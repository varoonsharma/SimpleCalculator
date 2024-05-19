import java.util.Scanner;

public class SimpleCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Display welcome message and instructions
        System.out.println("Welcome to the Simple Calculator!");
        System.out.println("Please enter the first number:");

        // Read the first number
        double num1 = scanner.nextDouble();

        // Ask for the operator
        System.out.println("Please enter an operator (+, -, *, /):");
        char operator = scanner.next().charAt(0);

        // Ask for the second number
        System.out.println("Please enter the second number:");
        double num2 = scanner.nextDouble();

        // Perform the calculation based on the operator
        double result;
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
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                    return; // Exit the program
                }
                break;
            default:
                System.out.println("Error: Invalid operator.");
                return; // Exit the program
        }

        // Display the result
        System.out.println("The result is: " + result);
    }
}
