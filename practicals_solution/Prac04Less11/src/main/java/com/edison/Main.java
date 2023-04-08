package com.edison;

public class Main {
    public static void animalSounds(Animal[] animals) {
        for (Animal animal : animals) {
            animal.makeSound();
        }
    }
    public static void feedAnimals(Animal[] animals) {
        for (Animal animal : animals) {
            animal.eat();
        }
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Animal[] animals = new Animal[2];
        animals[0] = new Dog();
        animals[1] = new Cat();
        animalSounds(animals);
        feedAnimals(animals);

        Animal[] moreAnimals = new Animal[3];
        moreAnimals[0] = new Dog();
        moreAnimals[1] = new Cat();
        moreAnimals[2] = new Bird();
        animalSounds(moreAnimals);
        feedAnimals(moreAnimals);
    }
}