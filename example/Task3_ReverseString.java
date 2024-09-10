package org.example;
/*
Reverse a String: Write a function to reverse a given string. For example, given the input "Hello", the output should be "olleH".
 */
public class Task3_ReverseString {
    public static void main(String[] args) {
         String str = "HelloWorld";

         StringBuilder str1 = new StringBuilder();

        str1.append(str);
        str1.reverse();

        System.out.println(str1);

    }
}
