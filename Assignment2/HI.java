package com.Assignment2;

// Base class
class Animal {
    private String name;

    // Constructor
    public Animal(String name) {
        this.name = name;
    }

    // Method to display animal details
    public void displayDetails() {
        System.out.println("Animal Name: " + name);
    }

    // Method to make sound (can be overridden)
    public void makeSound() {
        System.out.println("Animal sound");
    }
}

// Derived class 1
class Dog extends Animal {
    // Constructor
    public Dog(String name) {
        super(name); // Call to the parent constructor
    }

    // Overriding the makeSound method
    @Override
    public void makeSound() {
        System.out.println("Woof! Woof!");
    }
}

// Derived class 2
class Cat extends Animal {
    // Constructor
    public Cat(String name) {
        super(name); // Call to the parent constructor
    }

    // Overriding the makeSound method
    @Override
    public void makeSound() {
        System.out.println("Meow! Meow!");
    }
}

public class HI {
    public static void main(String[] args) {
        // Creating instances of Dog and Cat
        Dog dog = new Dog("Buddy");
        Cat cat = new Cat("Whiskers");

        // Displaying details and sounds for each animal
        dog.displayDetails();
        dog.makeSound();
        System.out.println();

        cat.displayDetails();
        cat.makeSound();
    }
}
