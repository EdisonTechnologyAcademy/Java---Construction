package com.edison;

public class Cat extends Animal {
    private String breed;

    public Cat(String name, int age, String breed) {
        super(name, age);
        this.breed = breed;
    }

    public void meow() {
        System.out.println("The cat is meowing.");
    }

    @Override
    public void sleep() {
        System.out.println("The cat is sleeping.");
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
}
