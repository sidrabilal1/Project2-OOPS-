package org.example;

public class Task2_AlphaCountCharacter {
    public static void main(String[] args) {

        String string = "sajkejkmMAncn30850p6$$$56";
        int count =0;
         for(int i =0; i <string.length(); i++){
             if(Character.isLetter(string.charAt(i)))
             count++;

         }
        System.out.println("Total number of alpha characters in string: " +count);


    }
}

