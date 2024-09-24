package com.Assignment2;

// Base class
class Employee {
    private String name;
    private int employeeId;

    // Constructor
    public Employee(String name, int employeeId) {
        this.name = name;
        this.employeeId = employeeId;
    }

    // Method to display employee details
    public void displayDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + employeeId);
    }
}

// Intermediate class
class Manager extends Employee {
    private String department;

    // Constructor
    public Manager(String name, int employeeId, String department) {
        super(name, employeeId); // Call to the parent constructor
        this.department = department;
    }

    // Method to display manager details
    @Override
    public void displayDetails() {
        super.displayDetails(); // Call to Employee's display method
        System.out.println("Department: " + department);
    }
}

// Derived class
class Director extends Manager {
    private int budget;

    // Constructor
    public Director(String name, int employeeId, String department, int budget) {
        super(name, employeeId, department); // Call to the parent constructor
        this.budget = budget;
    }

    // Method to display director details
    @Override
    public void displayDetails() {
        super.displayDetails(); // Call to Manager's display method
        System.out.println("Budget: $" + budget);
    }
}

public class MI {
    public static void main(String[] args) {
        // Creating an instance of Director
        Director director = new Director("Alice Smith", 1001, "IT", 500000);

        // Displaying the details of the director
        director.displayDetails();
    }
}
