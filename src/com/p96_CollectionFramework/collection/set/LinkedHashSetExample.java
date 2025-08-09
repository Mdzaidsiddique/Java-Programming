package com.p96_CollectionFramework.collection.set;

import java.util.LinkedHashSet;

// this is the child class of HashSet
public class LinkedHashSetExample {

    public static void main(String[] args) {

        LinkedHashSet<String> lhs = new LinkedHashSet<>();

        lhs.add("one");
        lhs.add("two");
        lhs.add("three");
        lhs.add("one"); lhs.add(null); // // no error but won't add

        System.out.println(lhs); // [one, two, three, null]
    }
}
