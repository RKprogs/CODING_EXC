package com.Assignment3;

import java.util.Scanner;

public class StrCon {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first name: ");
        String firstName = scanner.nextLine();

        System.out.print("Enter last name: ");
        String lastName = scanner.nextLine();

        String fullName = firstName + " " + lastName;
        System.out.println("Full name: " + fullName);
    }
}
