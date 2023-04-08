package com.edison;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("John", 25);
        map.put("Mary", 30);
        map.put("Bob", 40);
        System.out.println("Size of Map: " + map.size());
        System.out.println("Values of Map: " + map.values());
        System.out.println("Keys of Map: " + map.keySet());
        System.out.println("Map contains key John: " + map.containsKey("John"));
        System.out.println("Map contains value 30: " + map.containsValue(30));
        map.remove("Mary");
        System.out.println("Updated Map: " + map.entrySet());
        for(Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
}