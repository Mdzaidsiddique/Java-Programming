package com.oops;

public class HumanClass {

    /* instance variable:
        - a variable that is created inside the class but outside the methods
        - it gets memory at runtime (not at compile time) when object or instance is created */

    String name; // instance variable
    int age;

    void speak(){

        int x = 100; // local variable
        System.out.println("My name is " + name + " and I am " + age + " years old.");
    }

    public static void main(String[] args) {
        HumanClass hc = new HumanClass();

        hc.name = "zaid alif siddique";
        hc.age = 26;
        hc.speak();
    }
}
