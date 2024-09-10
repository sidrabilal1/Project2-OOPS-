package org.example;
/*
Write a program to swap 2 String without a temporary variable?
 */

public class Task1_SwapStrings {
    public static void main(String[] args) {

        String a = "Good";
        String b = "Morning";
        System.out.println("Before swap: " +a+ " " +b);
        a = a + b;
        b = a.substring(0,a.length() - b.length());
        a = a.substring(b.length());
        System.out.println("After swap: " +a+ " " +b);
    }
}
