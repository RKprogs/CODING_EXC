package com.Assignment3.AgeCalc;

import java.time.LocalDate;
import java.time.Period;

public class Person {
    private String firstName;
    private String lastName;
    private LocalDate dob; // Date of Birth

    public Person(String firstName, String lastName, LocalDate dob) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dob = dob;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public LocalDate getDob() {
        return dob;
    }
    public void setDob(LocalDate dob) {
        this.dob = dob;
    }

    private int GetAge(LocalDate dob) {
        setDob(dob);
        LocalDate today = LocalDate.now();
        return Period.between(dob, today).getYears();
    }

    public String Adult() {
        int age = GetAge(this.dob);
        return (age >= 18) ? "Adult" : "Child";
    }

    public void displayDetails() {
        System.out.println("\nFirst Name: " + firstName);
        System.out.println("\nLast Name: " + lastName);
        System.out.println("\nAge: " + GetAge(this.dob));
        System.out.println("\n"+Adult());
    }
}
