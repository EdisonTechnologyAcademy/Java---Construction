package com.edison;

public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Fluffy", 3, "Persian");
        System.out.println("Name: " + cat.getName());
        System.out.println("Age: " + cat.getAge());
        System.out.println("Breed: " + cat.getBreed());
        cat.eat();
        cat.sleep();
        cat.meow();
    }
}