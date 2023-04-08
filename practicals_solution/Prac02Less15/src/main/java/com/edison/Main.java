package com.edison;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Set<String> set = new HashSet<String>();
        set.add("apple");
        set.add("banana");
        set.add("orange");
        set.add("kiwi");

        for (String s : set) {
            System.out.println(s);
        }
        if (set.contains("banana")) {
            System.out.println("Set contains banana");
        }

        set.remove("kiwi");

        for (String s : set) {
            System.out.println(s);
        }

        Set<String> set2 = new HashSet<String>();
        set2.add("banana");
        set2.add("grape");
        set2.add("peach");

        set.retainAll(set2);

        for (String s : set) {
            System.out.println(s);
        }
        System.out.println("Size of set: " + set.size());
        System.out.println("Nothing");
        set.clear();
        for (String s : set) {
            System.out.println(s);
        }
    }
}