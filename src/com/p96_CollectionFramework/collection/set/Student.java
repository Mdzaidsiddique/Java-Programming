package com.p96_CollectionFramework.collection.set;

public class Student implements Comparable<Student>{

    private int roll;
    private String name;
    private int marks;

    public Student(){}

    public Student(int roll, String name, int marks){
        this.roll = roll;
        this.name = name;
        this.marks = marks;
    }

    public int getMarks() {
        return marks;
    }

    public int getRoll() {
        return roll;
    }

    public String getName() {
        return name;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

//    @Override
//    public int compareTo(Student stu) {
//        if(this.roll > stu.roll){
//            return +1;
//        }else if(this.roll < stu.roll){
//            return -1;
//        }else{
//            return 0;
//        }
//    }

    // Overriding to compareTo method to sort the object according to the name


    @Override
    public int compareTo(Student stu) {
        return name.compareTo(stu.name);
    }

    @Override
    public String toString() {
        return "Student: {roll : "+roll+
                           ", name : "+name+
                           ", marks : "+marks+"}";
    }
}

