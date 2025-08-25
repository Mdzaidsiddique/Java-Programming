package com.p2_data_types;

public class BoxingAndUnboxing {

    public static void main(String[] args) {

        int x = 10;
        //let's convert this primitive to the corresponding wrapper object

        Integer i1 = Integer.valueOf(x); // boxing

        Integer i2 = x; //autoboxing

       //or

        Integer i3 = 10; //autoboxing
        int x1 = i3.intValue(); //unboxing

        int x2 = i3; // auto-unboxing
    }
}
