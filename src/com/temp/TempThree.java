package com.temp;

public class TempThree {
    public static void main(String[] args) {
        int a = 10;
        boolean b = !false && (++a == 11 && a++ == 11);
        System.out.println(a + " " + b);
    }
}
