package com.p91_interface;

import com.p92_binding.Animal;
import com.p92_binding.Dog;

public class Main {

    public static void main(String[] args) {

        Interface1Impl ic = new Interface1Impl();

        ic.abstractMethod();
        ic.defaultMethod();

        Interface1.staticMethod();
    }
}
