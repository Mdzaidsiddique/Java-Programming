package com.p96_CollectionFramework.map;


import java.util.*;

public class HashMapIteration {

    public static void main(String[] args) {
        HashMap<Integer,String> hm = new HashMap<>();
        System.out.println(hm);//{}
        hm.put(1,"one");
        hm.put(2,"two");
        hm.put(3,"three");
        hm.put(4,"four");
        hm.put(5,"five");

        //getting all keys
        Set<Integer> keys = hm.keySet();
        for(Integer x: keys){
            System.out.println(x);
        }

        // getting all values
        Collection<String> values = hm.values();
        for(String val: values){
            System.out.println(val);
        }

        // getting both keys & values
        Set<Map.Entry<Integer, String>> keyValue = hm.entrySet();
        for(Map.Entry<Integer, String> kv: keyValue){
            System.out.println(kv); // k=v
            System.out.println(kv.getKey() +"---"+kv.getValue()); // k---v
        }

    }
}
