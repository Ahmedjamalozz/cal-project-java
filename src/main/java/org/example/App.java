package org.example;

/**
 * Hello world!
 *
 */
import java.util.Scanner;
public class App

{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);

        boolean running = true;

        while (running) {
            displayMenu();
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    performOperation('+');
                    break;
                case 2:
                    performOperation('-');
                    break;
                case 3:
                    performOperation('*');
                    break;
                case 4:
                    performOperation('/');
                    break;
                case 5:
                    running = false;
                    break;
                default:
                    System.out.println("Invalid choice! Please enter a number between 1 and 5.");
            }
        }

        System.out.println("bye");
        scanner.close();
    }

    public static void displayMenu() {
        System.out.println("Display Menu:");
        System.out.println("1. Addition (+)");
        System.out.println("2. Subtraction (-)");
        System.out.println("3. Multiplication (*)");
        System.out.println("4. Division (/)");
        System.out.println("5. Exit");
        System.out.println("Please enter your choice:");
    }


    public static void performOperation(char operator) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the first number:");
        double num1 = scanner.nextDouble();

        System.out.println("Please enter the second number:");
        double num2 = scanner.nextDouble();

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
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Error: This program cannot be divided by zero.");
                    return;
                }
                break;
            default:
                System.out.println("Error: Invalid operator, cannot use symbols or alphabetic characters.");
                return;
        }



        System.out.println("Result: " + result);

    }
}
