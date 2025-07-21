package com.p8_inheritance;

public class ICICI extends Bank{

    @Override
    public int getRateOfInterest() {
        System.out.println("Icici RAI is 7");
        return 7;
    }
}
