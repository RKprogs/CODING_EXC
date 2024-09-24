package com.Assignment2;

class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public void displayDetails() {
        System.out.println("Animal Name: " + name);
    }

    public void makeSound() {
        System.out.println("Animal sound");
    }
}

class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("Woof! Woof!");
    }
}

class Cat extends Animal {

    public Cat(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("Meow! Meow!");
    }
}

public class HI {
    public static void main(String[] args) {

        Dog dog = new Dog("Ron");
        Cat cat = new Cat("Tom");

        dog.displayDetails();
        dog.makeSound();
        System.out.println();

        cat.displayDetails();
        cat.makeSound();
    }
}
