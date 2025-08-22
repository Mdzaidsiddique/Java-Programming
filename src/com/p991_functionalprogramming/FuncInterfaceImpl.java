package com.p991_functionalprogramming;

public class FuncInterfaceImpl implements FuncInterface {

    // this is the functional implementation class for FuncInterface (FI)
    // this is one of approach to implement functional interface

    @Override
    public void sayHello(String name) {
        System.out.println("hello "+name+" from implementation class");
    }

}
