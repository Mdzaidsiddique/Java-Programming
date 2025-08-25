package com.p14_interface;

public class Main {

    public static void main(String[] args) {

        Interface1Impl ic = new Interface1Impl();

        ic.abstractMethod();
        ic.defaultMethod();

        Interface1.staticMethod();
    }
}
