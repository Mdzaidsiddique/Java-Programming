package com.p19_CollectionFramework.map;

import java.util.*;

public class TreeMapExample {

    public static void main(String[] args) {

        TreeMap<Integer, String> tm1 = new TreeMap<>();
        // all wrapper/string classes internally implements comparable interface

        tm1.put(1,"one");
        tm1.put(2, "two");
//        tm1.put(null, null); //NullPointerException

        System.out.println(tm1);

        // tree map of students based on their marks using comparator
        TreeMap<Student, String> tm = new TreeMap<>(new StudentMarksComparator());

        tm.put(new Student(12, "zaid", 766), "Aligarh");
        tm.put(new Student(42, "alif", 773), "Lucknow");
        tm.put(new Student(8, "umair", 885), "Delhi");
        tm.put(new Student(32, "masood", 682), "Chandigarh");

        System.out.println(tm);

        Set<Map.Entry<Student,String>> set= tm.entrySet();

        for(Map.Entry<Student,String> me : set){
            System.out.println(me.getValue());

            Student student = me.getKey();
            System.out.println(student.getMarks());
        }

    }
}
