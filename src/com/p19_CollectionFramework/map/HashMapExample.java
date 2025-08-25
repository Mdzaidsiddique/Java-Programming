package com.p19_CollectionFramework.map;

import java.util.HashMap;

public class HashMapExample {

    public static void main(String[] args) {

        HashMap<Integer, String> hm = new HashMap<>();

        hm.put(45, "zaid alif");
        hm.put(007, "masood raza");
        hm.put(20, "ahmad");
        hm.put(null,"four"); //one null is allowd as a key
        hm.put(null,"FOUR"); //four will be replaced with FOUR
        hm.put(2,"TWO"); // two will be replaced with TWO
        hm.put(5,null);
        hm.put(6,null); //as a value any number of null be allowed

        System.out.println(hm); //{20=ahmad, 7=masood raza, 45=zaid alif}
        System.out.println(hm.get(7)); //masood raza
        System.out.println(hm.size()); //3
        System.out.println(hm.keySet()); //[null, 2, 20, 5, 6, 7, 45]
    }
}
