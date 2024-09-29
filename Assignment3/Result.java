package com.Assignment3;

import java.util.Scanner;

public class Result {
    public static void main(String[] args) {
        int x;
        int y;
        Scanner sc = new Scanner(System.in);
        System.out.println("Eneter the value of x");
        x = sc.nextInt();
        System.out.println("Eneter the value of y");
        y = sc.nextInt();

        if(x<y)
            System.out.println("The result of whether x is less than y is true");
        else
            System.out.println("The result of whether x is less than y is false");
    }
}
