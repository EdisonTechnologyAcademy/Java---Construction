package com.edison;

public class Main {
    public static void main(String[] args) {
        // Create a box that contains a string
        Box<String> stringBox1 = new Box<>("Hello");
        Box<String> stringBox2 = new Box<>("World");

        // Compare the values of the two string boxes
        int stringComparison = stringBox1.compareTo(stringBox2);
        System.out.println("String comparison: " + stringComparison);

        // Create a box that contains an integer
        Box<Integer> integerBox1 = new Box<>(42);
        Box<Integer> integerBox2 = new Box<>(24);

        // Compare the values of the two integer boxes
        int integerComparison = integerBox1.compareTo(integerBox2);
        System.out.println("Integer comparison: " + integerComparison);
    }
}