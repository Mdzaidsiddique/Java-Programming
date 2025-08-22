package com.p991_functionalprogramming;

public class Student{

    int roll;
    String name;
    int marks;

    public Student(int roll, String name, int marks){
        this.roll = roll;
        this.name = name;
        this.marks = marks;
    }

    public int getRoll() {
        return roll;
    }

    public String getName() {
        return name;
    }

    public int getMarks() {
        return marks;
    }

    @Override
    public String toString() {
//        return '\n'+ "Roll : "+roll + '\n'+"Name : "+name+'\n'+"Marks : "+marks;
        return "Roll : "+roll+", Name : "+name+", Marks : "+marks;
    }

}
