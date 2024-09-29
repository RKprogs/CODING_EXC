package com.Assignment3;

import java.util.Scanner;

public class SqCu {
    static double FindSquare(double x){
        return x*x;
    }

    static double FindCube(double x){
        return x*x*x;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number:");

        double n = sc.nextDouble();

        System.out.printf("Square of %.1f is %.1f",n,FindSquare(n));
        System.out.println();
        System.out.printf("Cube of %.1f is %.1f",n,FindCube(n));
    }
}
