package com.edison;

import java.awt.*;

public class Main {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(5, 10);
        r.display(); //Đây là 1 shape
        System.out.println("Area of rectangle: " + r.area());
    }
}