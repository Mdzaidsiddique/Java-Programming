package com.p8_inheritance;

public class Cat extends Animal{

    Cat(String name){
        super(name);
    }

    void meow(){
        System.out.println(name+" meow meow...");
    }

}
