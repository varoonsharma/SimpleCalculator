
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