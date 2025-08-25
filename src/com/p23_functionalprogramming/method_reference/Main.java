package com.p23_functionalprogramming.method_reference;

public class Main {

    public static void main(String[] args) {


        MyFunctionalInterfaceOne f1 = Person::new;
        System.out.println(f1);

        MyFunctionalInterfaceTwo f2 = Person::new;
        f2.createPerson("Zaid", 27);


    }
}
