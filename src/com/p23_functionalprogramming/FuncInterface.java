package com.p23_functionalprogramming;

public interface FuncInterface {

    // only one abstract method
    void sayHello(String name); // its like public abstract void sayHello(String name);

    //Note: abstract kw is not necessary because all methods in interfaces were implicitly public abstract

    default void defaultMethod(){
        System.out.println("inside default method of interface one");
    }

    static void staticMethod(){
        System.out.println("inside static method of interface one");
    }

    // method of object class
    public boolean equals(Object o);
}
