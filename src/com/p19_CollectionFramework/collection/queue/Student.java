package com.p19_CollectionFramework.collection.queue;
import java.util.*;

class Student {
    int roll;
    String name;

    Student(int roll, String name) {
        this.roll = roll;
        this.name = name;
    }

    public String toString() {
        return roll + " - " + name;
    }
}

// Comparator for priority (smaller roll = higher priority)
class StudentRollComparator implements Comparator<Student> {
    public int compare(Student s1, Student s2) {
        return s1.roll - s2.roll;
    }
}

class Main {
    public static void main(String[] args) {
        PriorityQueue<Student> pq = new PriorityQueue<>(new StudentRollComparator());

        pq.add(new Student(3, "Zaid"));
        pq.add(new Student(1, "Amir"));
        pq.add(new Student(2, "Salman"));

        System.out.println(pq.poll()); // 1 - Amir
        System.out.println(pq.poll()); // 2 - Salman
        System.out.println(pq.poll()); // 3 - Zaid
    }
}


