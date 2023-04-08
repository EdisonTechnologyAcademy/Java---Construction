package com.edison;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("Enter the first number: ");
            int a = scanner.nextInt();
            System.out.print("Enter the second number: ");
            int b = scanner.nextInt();
            int result = Calculator.divide(a, b);
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero!");
        } catch (InputMismatchException e) {
            System.out.println("Error: Invalid input!");
        } catch (DivisionByZeroException e) {
            System.out.println("Error: Division by zero!");
        } finally {
            System.out.println("Program complete.");
        }
        scanner.close();
    }
}