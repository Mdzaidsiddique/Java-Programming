package com.p8_inheritance;

public class AxisBank extends Bank{

    @Override
    public int getRateOfInterest() {
        System.out.println("Axis rai is 9");
        return 9;
    }
}
