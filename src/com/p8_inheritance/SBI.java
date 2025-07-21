package com.p8_inheritance;

public class SBI extends Bank{

    @Override
    public int getRateOfInterest() {
        System.out.println("SBI RAI is 8");
        return 8;
    }
}
