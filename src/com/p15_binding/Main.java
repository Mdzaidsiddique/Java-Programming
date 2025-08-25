package com.p15_binding;

public class Main {

    public static void main(String[] args) {
        //early binding
        Animal an = new Animal();
        an.sound(); // early binding


        // late binding
        Animal a = new Dog(); // reference type is Animal, object is Dog
        a.sound(); // late binding: resolved at runtime, Dog's sound() is called
    }
}
