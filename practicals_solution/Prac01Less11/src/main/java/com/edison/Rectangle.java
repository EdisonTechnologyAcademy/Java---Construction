package com.edison;

public class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    //Ghi đè phương thức trừu tượng của lớp Shape
    public double area() {
        return length * width;
    }
}            
