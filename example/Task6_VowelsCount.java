package org.example;
/*
Create a method to count how many vowels are present in a string “documentation”
 */

public class Task6_VowelsCount {
    public static void main(String[] args) {

        String str = "documentation";
        int count = 0;
        for (int i = 0 ; i < str.length(); i++) {
            char ch = str.charAt(i);
            if(ch == 'a'|| ch == 'e'|| ch == 'i' ||ch == 'o' ||ch == 'u'|| ch == 'A'|| ch == 'E'|| ch == 'I'|| ch == 'O'|| ch == 'U') {
                count ++;
            }
        }
        System.out.println("Number of vowels in the given sentence: " + count);
    }
}



