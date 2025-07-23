package com.p91_interface;

public interface Interface1 {

    // abstract method
    public abstract void abstractMethod();

    // default method
    public default void defaultMethod(){
        System.out.println("inside default method of interface 1");
    }

}
