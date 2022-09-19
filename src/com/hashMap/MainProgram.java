package com.hashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class MainProgram {
    public static void main(String[] args) {
        Map<String, String> hashMap = new HashMap<>();

        hashMap.put("Country", "India");
        hashMap.put("FirstName", "Rajendra");
        hashMap.put("LastName", "Arora");
        hashMap.put("Passport", "R5182388");

        for (Entry<String, String> entry : hashMap.entrySet()) {
            System.out.println(entry);
        }

        for (String key : hashMap.keySet()) {
            System.out.println(key);
        }

        for (String value : hashMap.values()) {
            System.out.println(value);
        }
    }
}