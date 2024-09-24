package com.Assignment2;

class Person {
    private String name;

    public String gender;
    public int age;

    public Person(String name, String gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void displayDetails() {
        System.out.println("Name: " + getName());
        System.out.println("Gender: " + gender);
        System.out.println("Age: " + age);
        System.out.println("------------------------------\n");
    }
}

public class PersonDetails {
    public static void main(String[] args) {
        Person p1 = new Person("RK","M",23);
        p1.displayDetails();
        System.out.println("After changing private variable \"name\" using getters and setters\n");
        p1.setName("ABCD");
        p1.displayDetails();
    }
}
