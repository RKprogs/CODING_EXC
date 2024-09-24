package com.Assignment2;

class Vehicle {
    protected String registrationNumber;
    protected String brand;

    // Constructor
    public Vehicle(String registrationNumber, String brand) {
        this.registrationNumber = registrationNumber;
        this.brand = brand;
    }

    // Method to display vehicle details
    public void displayDetails() {
        System.out.println("Registration Number: " + registrationNumber);
        System.out.println("Brand: " + brand);
    }

    // Abstract method to calculate parking fee (to be implemented in derived classes)
    public double calculateParkingFee(int hours) {
        return 0.0;
    }
}

class Car extends Vehicle {
    private int numDoors;

    // Constructor
    public Car(String registrationNumber, String brand, int numDoors) {
        super(registrationNumber, brand);
        this.numDoors = numDoors;
    }

    @Override
    public double calculateParkingFee(int hours) {
        // Parking fee: $2 per hour for cars
        return hours * 2.0;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Number of Doors: " + numDoors);
    }
}

class Motorcycle extends Vehicle {
    private String engineType;

    // Constructor
    public Motorcycle(String registrationNumber, String brand, String engineType) {
        super(registrationNumber, brand);
        this.engineType = engineType;
    }

    @Override
    public double calculateParkingFee(int hours) {
        // Parking fee: $1 per hour for motorcycles
        return hours * 1.0;
    }

    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Engine Type: " + engineType);
    }
}

public class ParkingSystem {
    public static void main(String[] args) {
        Car car = new Car("ABC123", "Toyota", 4);
        Motorcycle motorcycle = new Motorcycle("XYZ456", "Harley Davidson", "V-twin");

        // Display details and calculate parking fees
        int carParkingHours = 5;
        int motorcycleParkingHours = 3;

        System.out.println("Car Details:");
        car.displayDetails();
        System.out.printf("Parking Fee for %d hours: Rs. %.2f%n", carParkingHours, car.calculateParkingFee(carParkingHours));
        System.out.println();

        System.out.println("Motorcycle Details:");
        motorcycle.displayDetails();
        System.out.printf("Parking Fee for %d hours: Rs. %.2f%n", motorcycleParkingHours, motorcycle.calculateParkingFee(motorcycleParkingHours));
    }
}
