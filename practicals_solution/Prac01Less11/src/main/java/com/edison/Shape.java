package com.edison;

public abstract class Shape {
    //Phương thức trừu tượng (Không có phần thân)
    public abstract double area();

    //Phương thức thông thường
    public void display() {
        System.out.println("This is a shape.");
    }
}