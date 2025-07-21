package com.p9_polymorphism;

import com.p8_inheritance.Cat;

public class Main {

    public static void main(String[] args) {

        // up casting
        Animal dogAnimal = new Dog();
        dogAnimal.sound(); // Dog's sound() will be called (runtime decision)


        // downcasting
        Dog d = (Dog) dogAnimal;
        d.sound(); // Now we can call Dog-specific methods
    }
}
