package com.Assignment2;

class Employee {
    private String name;
    private int employeeId;

    public Employee(String name, int employeeId) {
        this.name = name;
        this.employeeId = employeeId;
    }

    public void displayDetails() {
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + employeeId);
    }
}


class Manager extends Employee {
    private String department;

    public Manager(String name, int employeeId, String department) {
        super(name, employeeId);
        this.department = department;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Department: " + department);
    }
}

class Director extends Manager {
    private int budget;

    public Director(String name, int employeeId, String department, int budget) {
        super(name, employeeId, department);
        this.budget = budget;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Budget: $" + budget);
    }
}

public class MI {
    public static void main(String[] args) {
        Director director = new Director("Alice Smith", 1001, "IT", 500000);

        director.displayDetails();
    }
}
