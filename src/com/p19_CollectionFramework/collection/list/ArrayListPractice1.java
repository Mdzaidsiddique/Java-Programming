package com.p19_CollectionFramework.collection.list;

import java.util.ArrayList;

public class ArrayListPractice1 {

    public void arrayListImplementation(){
        ArrayList<String> al = new ArrayList<>(); // default size it 10

        al.add("one");
        al.add("two");
        al.add(null);
        al.add("one");
        al.add(null);

        System.out.println(al); //[one, two, null, one, null]
        System.out.println(al.size()); //5
        System.out.println(al.get(2)); //null
        System.out.println(al.contains(null)); //true
        System.out.println(al.indexOf("one")); //0 (return index of first occurrence)
    }

    public static void main(String[] args) {

        ArrayListPractice1 alp = new ArrayListPractice1();
        alp.arrayListImplementation();

    }
}
