package com.p96_CollectionFramework.map;

public class Student {

    private int roll;
    private String name;
    private int marks;

    public Student(int roll, String name, int marks){
        this.roll = roll;
        this.name = name;
        this.marks = marks;
    }

    // getter & setter
    public int getMarks() {
        return marks;
    }
}
