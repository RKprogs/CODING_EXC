package com.Assignment3;

import java.util.Scanner;

public class StrRev {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        String sentence = sc.nextLine();
        String[] sArray = sentence.split(" ");
        for(int i= sArray.length-1;i>=0;i--)
            System.out.print(sArray[i]+" ");
    }
}
