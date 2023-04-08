package com.edison;

public class Main {
    public static void main(String[] args) {
        int sum = 0;
        //Vòng lặp for bắt đầu và chạy cho tới x=20
        for (int x = 1; x <= 20; x++) {
            sum = sum + x;
        }
        System.out.println("Sum: " + sum);
    }
}