package com.p96_CollectionFramework.map;

import java.util.Hashtable;
import java.util.Map;

public class HasTableExample {

    /*HashMap & HashTable:
    - both are used to stored data in key-values from
    - both are using hashing technique to store unique keys

    Differences:
    HashMap - HashMap is non Synchronized, not thread-safe
            - can't be shared bw many thread without proper synchronized code
            - allow only one null key and multiple null values

    HashTable - synchronized, thread-safe & can be shared with multiple threads
              - HashTable doesn't allow any null keys or values */

    public static void main(String[] args) {

        Hashtable<Integer, String> ht = new Hashtable<>();

        ht.put(5,"five");
        ht.put(6, "six");
        ht.put(1, "one");
//        ht.put(0, null); // NullPointerException
        System.out.println(ht);

        for(Map.Entry<Integer, String> m:ht.entrySet()){
            System.out.println(m.getKey()+" -- "+m.getValue());
        }
    }
}
