package org.example;
/*
Find the First Non-Repeating Character in a String: Given a string, find and return the first non-repeating character. For example, in the string "abracadabra", the first non-repeating character is 'c'.
 */

public class Task9_FirstNonRepeatingCharacter {
    public static void main(String[] args) {


        String s = "abracadabra";
        for(Character ch:s.toCharArray()) {
            if(s.indexOf(ch) == s.lastIndexOf(ch)) {
                System.out.println("First non repeat character = " + ch);
                break;
            }
        }
    }
}





