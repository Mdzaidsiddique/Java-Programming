package com.p19_CollectionFramework.collection.set;

import java.util.TreeSet;

public class TreeSetExample {

/* In this implementation:
    - TreeSet is a sorted collection (it implements the SortedSet & Set interface)
    - It stores elements in ascending order by default (natural ordering)
    - To decide the order, TreeSet needs a way to compare elements

Comparable interface:
    - comparable interface defines the natural ordering of objects
    - a class implements comparable interface & override compareTo method

    - TreeSet uses a self-balancing binary search tree & contains unique element only like hashSet


Note: TreeSet class by default only accept Comparable Object, if we try to add other obj then it will
      throw ClasCastException
    - when you insert objects in tree set it uses compareTo() to determine order and uniqueness
    - TreeSet class doesn't allow null element, even single null is not allowed else it throws NullPointerException
*/

    public static void main(String[] args) {

        Student st = new Student(45, "zaid alif", 786);
        System.out.println(st);

        TreeSet<Student> ts = new TreeSet<>();

        ts.add(new Student(45, "zaid", 786));
        ts.add(new Student(23, "alif", 599));
        ts.add(new Student(20,"Amit",520));
        ts.add(new Student(15,"Suresh",550));
        ts.add(new Student(22,"Ajay",540));
        ts.add(new Student(18,"Rajesh",590));

        System.out.println(ts);

        TreeSet<Integer> tsi = new TreeSet<>();
        tsi.add(5);
        tsi.add(3);
        tsi.add(2);

        System.out.println(tsi); // [2, 3, 5]


        // treeSet using Comparator interface
        TreeSet<Student> tsc = new TreeSet<>(new StudentRollComparator());

        tsc.add(new Student(20,"Amit",520));
        tsc.add(new Student(15,"Suresh",550));
        tsc.add(new Student(22,"Ajay",540));
        tsc.add(new Student(18,"Rajesh",590));

        System.out.println(tsc);
    }

}
