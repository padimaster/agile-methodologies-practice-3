package com.app.utils;

import java.util.Scanner;

public class ArithmeticMenu {

    public void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Español\n2. English");
        int opcion = scanner.nextInt();

        if (opcion != 1) {
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
                        performAddition();
                        break;
                    case 2:
                        performSubtraction();
                        break;
                    case 3:
                        performMultiplication();
                        break;
                    case 4:
                        performDivision();
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
        } else {
            System.out.println("Bienvenido al menú Arithmetic!");
            while (true) {
                // Display menu options
                System.out.println("\nSeleccione una operación:");
                System.out.println("1. Suma");
                System.out.println("2. Resta");
                System.out.println("3. Multiplicación");
                System.out.println("4. División");
                System.out.println("5. Salir");
                System.out.print("Ingrese su opción: ");

                // Get user input
                int choice = scanner.nextInt();

                // Perform actions based on user choice
                switch (choice) {
                    case 1:
                        realizarSuma();
                        break;
                    case 2:
                        realizarResta();
                        break;
                    case 3:
                        realizarMultiplicacion();
                        break;
                    case 4:
                        realizarDivision();
                        break;
                    case 5:
                        System.out.println("Saliendo del programa. Adiós!");
                        scanner.close();
                        System.exit(0);
                        break;
                    default:
                        System.out.println("Opción inválida. Por favor ingrese un número entre 1 y 5.");
                }
            }
        }
    }

    private static void performAddition() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();
        double result = num1 + num2;
        System.out.println("Result: " + result);
    }

    private static void performSubtraction() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();
        double result = num1 - num2;
        System.out.println("Result: " + result);
    }

    private static void performMultiplication() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();
        double result = num1 * num2;
        System.out.println("Result: " + result);
    }

    private static void performDivision() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the dividend: ");
        double dividend = scanner.nextDouble();
        System.out.print("Enter the divisor: ");
        double divisor = scanner.nextDouble();

        if (divisor != 0) {
            double result = dividend / divisor;
            System.out.println("Result: " + result);
        } else {
            System.out.println("Error: Cannot divide by zero.");
        }
    }


    private static void realizarSuma() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el primer número: ");
        double num1 = scanner.nextDouble();
        System.out.print("Ingrese el segundo número: ");
        double num2 = scanner.nextDouble();
        double resultado = num1 + num2;
        System.out.println("Resultado: " + resultado);
    }

    private static void realizarResta() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el primer número: ");
        double num1 = scanner.nextDouble();
        System.out.print("Ingrese el segundo número: ");
        double num2 = scanner.nextDouble();
        double resultado = num1 - num2;
        System.out.println("Resultado: " + resultado);
    }

    private static void realizarMultiplicacion() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el primer número: ");
        double num1 = scanner.nextDouble();
        System.out.print("Ingrese el segundo número: ");
        double num2 = scanner.nextDouble();
        double resultado = num1 * num2;
        System.out.println("Resultado: " + resultado);
    }

    private static void realizarDivision() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el dividendo: ");
        double dividendo = scanner.nextDouble();
        System.out.print("Ingrese el divisor: ");
        double divisor = scanner.nextDouble();

        if (divisor != 0) {
            double resultado = dividendo / divisor;
            System.out.println("Resultado: " + resultado);
        } else {
            System.out.println("Error: No se puede dividir por cero.");
        }
    }

}
