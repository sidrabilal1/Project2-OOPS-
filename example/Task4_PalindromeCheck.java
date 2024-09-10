package org.example;
/*
Check if a String is Palindrome: Determine whether a given string is a palindrome, which means it reads the same forwards and backward. For example, "madam" is a palindrome.
 */
public class Task4_PalindromeCheck {
    public static void main(String[] args) {

        String str="madam";
        StringBuilder sb=new StringBuilder(str);
        StringBuilder newSB=sb.reverse();
        String str2= newSB.toString();
        if (str2.equals(str)){
            System.out.println(str+" is a palindrome");
        }else {
            System.out.println(str+" is not a palindrome");
        }


    }
}
