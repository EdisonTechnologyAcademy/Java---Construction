package com.edison;

public class Main {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("John Doe");
        student.setAge(20);
        student.setStudentID("123456");

        System.out.println("Name: " + student.getName());
        System.out.println("Age: " + student.getAge());
        System.out.println("Student ID: " + student.getStudentID());
    }
}