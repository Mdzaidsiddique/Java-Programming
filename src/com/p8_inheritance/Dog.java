package com.p8_inheritance;

public class Dog extends Animal{

    Dog(String name) {
        super(name);
    }

    void bark(){
        System.out.println(name + " barking...");
    }
}
