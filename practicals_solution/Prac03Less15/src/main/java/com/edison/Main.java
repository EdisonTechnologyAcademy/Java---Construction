package com.edison;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> myList = new ArrayList<String>();
        myList.add("apple");
        myList.add("banana");
        myList.add("orange");

        for (String fruit : myList) {
            System.out.println(fruit);
        }
        myList.add("grape");
        myList.remove("banana");
        if (myList.contains("apple")) {
            System.out.println("The list contains an apple.");
        }
        Collections.sort(myList);
        Collections.reverse(myList);
        myList.clear();
        for (String fruit : myList) {
            System.out.println(fruit);
        }
    }
}