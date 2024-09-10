package org.example;


import java.util.ArrayList;

/*
You have a list of strings and you want to keep only those that start with “A” and you want to return them in lower case".
 */
public class Task8_StringManipulation {
    public static void main(String[] args) {


        ArrayList<String> words=new  ArrayList<>();
        words.add("John");
        words.add("Christian");
        words.add("Alejandro");
        words.add("Ana");
        words.add("Carlos");
        words.forEach(x->{
            if(x.contains("A")){
                System.out.println(x.toLowerCase());
            }
        });
    }
}




