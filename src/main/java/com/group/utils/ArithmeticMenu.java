package com.group.utils;

import java.util.Scanner;

public class ArithmeticMenu {

    public void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Arithmetic Menu!");
        while (true) {
            // Display menu options
            System.out.println("\nSelect an operation:");
            System.out.println("1. Add");
            System.out.println("2. Subtract");
            System.out.println("3. Multiply");
            System.out.println("4. Divide");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            // Get user input
            int choice = scanner.nextInt();

            // Perform actions based on user choice
            switch (choice) {
                case 1:
                    Calculator.performAddition();
                    break;
                case 2:
                    Calculator.performSubtraction();
                    break;
                case 3:
                    Calculator.performMultiplication();
                    break;
                case 4:
                    Calculator.performDivision();
                    break;
                case 5:
                    System.out.println("Exiting the program. Goodbye!");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 5.");
            }
        }
    }
}
