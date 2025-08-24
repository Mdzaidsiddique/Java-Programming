package com.p991_functionalprogramming.inbuilt_functional_interface;

import java.util.function.Supplier;

public class SupplierFI {

    /*
        only one abstract method : public T get();
        doesn't take any args but return a value of T
     */

    public static void main(String[] args) {

        Supplier<String> supplier = () -> "all is well";

        System.out.println(supplier.get()); // all is well
    }
}
