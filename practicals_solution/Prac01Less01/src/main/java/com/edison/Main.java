package com.edison;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter first number: ");
        int num1 = scan.nextInt();

        System.out.println("Enter second number: ");
        int num2 = scan.nextInt();

        System.out.println("Num 1 is " + num1);
        System.out.println("Num 2 is " + num2);
    }
}