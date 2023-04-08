package com.edison;

public class Main {
    public static void main(String[] args) {
        Person person01 = new Person();
        person01.setName("John Doe");
        person01.setAge(20);

        System.out.println("Name: " + person01.getName());
        System.out.println("Age: " + person01.getAge());
    }
}