package com.p4_oops;

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

        /*
        - the new keyword is used to create a new object from a class.
        - it allocates memory for the object on the heap.
        - calls the constructor of the class to initialize the object.
        - Returns a reference to the newly created object, which you can store in a variable. */

        hc.name = "zaid alif siddique";
        hc.age = 26;
        hc.speak();
    }
}
