package com.Assignment3.Calculator;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Calculator calculator = new Calculator();

        System.out.print("Enter the operator:");
        char operator = scanner.next().charAt(0);

        System.out.print("Enter the operands:");
        int a = scanner.nextInt();
        int b = scanner.nextInt();

        switch (operator) {
            case '+':
                System.out.println("Result of "+a+"+"+b+"is " + calculator.Addition(a, b));
                break;
            case '-':
                System.out.println("Result of "+a+"-"+b+"is " + calculator.Subtraction(a, b));
                break;
            case '*':
                System.out.println("Result of "+a+"*"+b+"is " + calculator.Multiplication(a, b));
                break;
            case '/':
                double[] remainder = new double[1];
                double quotient = calculator.Division(a, b, remainder);
                System.out.println("Result of "+a+"/"+b+"is " + (int) quotient);
                System.out.println("Remainder: " + (int) remainder[0]);
                break;
            default:
                System.out.println("Invalid operator");
                break;
        }
    }
}

