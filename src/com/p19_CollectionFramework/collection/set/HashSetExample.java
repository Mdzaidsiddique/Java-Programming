package com.p19_CollectionFramework.collection.set;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {

    // since set interface doesn't support indexes, hence we cant use for loop for any set implemented classes

    // traversing elements using iterator
    public void traverseUsinfIterator(HashSet hs){

        Iterator<HashSet> hashSetIterator = hs.iterator();

        while(hashSetIterator.hasNext()){
            System.out.println(hashSetIterator.next());
        }
    }

    // traversing elements through enhanced for loop
    public void traverseUsingEnhancedForLoop(HashSet<String> hs){

        for(String item: hs){
            System.out.println("enhanced : "+item);
        }
    }

    public static void main(String[] args) {

        HashSet<String> hs = new HashSet<>();

        hs.add("one");
        hs.add("two");
        hs.add("three");
        hs.add(null);
        hs.add("one"); hs.add(null); // no error but won't add

        System.out.println(hs); // [null, one, two, three]

        HashSetExample hse = new HashSetExample();
        hse.traverseUsinfIterator(hs);
        hse.traverseUsingEnhancedForLoop(hs);
    }
}
