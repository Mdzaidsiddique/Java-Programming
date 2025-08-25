package com.p14_interface;

public interface Interface1 {

    // abstract method
    public abstract void abstractMethod();

    // static method
    public static void staticMethod(){
        System.out.println("inside static methods of interface 1");
    }

    // default method
    public default void defaultMethod(){
        System.out.println("inside default method of interface 1");
    }

}
