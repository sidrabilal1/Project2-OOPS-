package org.example;

/*
Count the Number of Words in a String: Write a function to count the number of words in a given string. Words are separated by spaces or punctuation. For example, the input "Hello, world!" should return 2.
 */
public class Task7_CountWords {
    public static void main(String[] args) {

        String str ="Hello, world!";
        int total = 1;


        for (int i = 0; i < str.length(); i++) {

            if ((str.charAt(i) == ' ') && (str.charAt(i + 1) != ' ')) {
                total++;
            }
        }
        // printing the result
        System.out.println("Number of words in the given string "+  total);

    }
}
