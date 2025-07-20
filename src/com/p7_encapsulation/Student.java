package com.p7_encapsulation;

public class Student {
    private int roll;
    private String name;
    private int age;

    public Student(){
        // zero args constructor (it may have parameterized constructor as well
    }

    // getter methods
    public int getRoll(){
        return roll;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    // setter methods
    public void setRoll(int newRoll){
        if(newRoll > 0) roll = newRoll;
    }

    public void setName(String newName){
        name = newName;
    }

    public void setAge(int newAge){
        if(newAge > 0) age = newAge;
    }

    public static void main(String[] args) {
        Student st = new Student();

        st.setRoll(45);
        st.setName("zaid alif siddique");
        st.setAge(26);

        System.out.println(st.getRoll());
        System.out.println(st.getName());
        System.out.println(st.getAge());
    }
}
