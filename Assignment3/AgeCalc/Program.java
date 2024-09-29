package com.Assignment3.AgeCalc;

import java.time.LocalDate;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first name: ");
        String firstName = scanner.nextLine();

        System.out.print("Enter last name: ");
        String lastName = scanner.nextLine();

        System.out.print("Enter date of birth in yyyy/mm/dd format: ");
        String dobInput = scanner.nextLine();
        LocalDate dob = LocalDate.parse(dobInput.replace("/", "-"));

        Person person = new Person(firstName,lastName,dob);

        person.displayDetails();
    }
}
