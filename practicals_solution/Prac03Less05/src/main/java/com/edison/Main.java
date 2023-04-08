package com.edison;

public class Main {
    public static void main(String[] args) {
        int x = 21, sum = 0;
        //Vòng lặp do-while
        do {
            //Thực thi lênh (thân vòng lặp)
            sum += x;
            x--;
        }while (x > 10); //Kiểm tra điều kiện
    }
}