package com.arrayList;

import java.util.ArrayList;
import java.util.List;

public class MainProgram {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("string1");
        list.add("string2");
        list.add("string3");
        list.add("string4");
        list.add("string5");

        for (String l : list) {
            System.out.println(l);
        }
    }
}
