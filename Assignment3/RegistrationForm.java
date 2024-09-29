package com.Assignment3;

import java.util.Scanner;

public class RegistrationForm {
    public static void main(String[] args) {
        String name;
        int age;
        String country;

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        name = sc.next();
        System.out.print("Enter your age: ");
        age = sc.nextInt();
        System.out.print("Enter your country: ");
        country = sc.next();

        System.out.printf("Welcome %s. Your age is %d and you are from %s",name,age,country);
    }
}
