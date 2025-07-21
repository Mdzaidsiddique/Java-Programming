package com.p8_inheritance;

public class Animal {

    String name;

    Animal(String name){
        this.name = name;
    }

    public void eat(){
        System.out.println(name + " eating...");
    }

}
