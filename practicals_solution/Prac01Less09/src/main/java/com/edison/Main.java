package com.edison;

public class Main {
    public static void main(String[] args) {
        Student obj = new Student();
        obj.setStdName("Kiran");
        obj.setStdRollNo(4);
        obj.setId(12345);

        System.out.println("Student's Name: " +obj.getStdName());
        System.out.println("Student's Roll no.: " +obj.getStdRollNo());
        System.out.println("Student's Id: " +obj.getStdId());
    }
}