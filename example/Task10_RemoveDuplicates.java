package org.example;
/*
How can you remove all duplicates from ArrayList?

 */
import java.util.ArrayList;
import java.util.LinkedHashSet;

public class Task10_RemoveDuplicates {
    public static void main(String[] args) {

        ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add("Markers");
        arrayList.add("Pencils");
        arrayList.add("Crayons");
        arrayList.add("Eraser");
        arrayList.add("Crayons");
        arrayList.add("Markers");
        arrayList.add("Ruler");

        System.out.println("OriginalList: " +arrayList);
        LinkedHashSet<String> stringSet = new LinkedHashSet<>(arrayList);
        arrayList.clear();
        arrayList.addAll(stringSet);

        System.out.println("After removing Duplicate: " +arrayList);



    }
    }
