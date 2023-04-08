package com.edison;

public class Main {
    public static void main(String[] args) {
        int x = 1, sum = 0;
        while (x <= 10) {
            //Cộng dồn x vào sum
            sum = sum + x;

            //Gia tăng giá trị của x mỗi vòng lặp
            x++;
        }
        System.out.println("Sum: " + sum);
    }
}