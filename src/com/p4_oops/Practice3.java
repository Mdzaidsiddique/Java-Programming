package com.p4_oops;

public class Practice3 {
    // this keyword

    int x = 100; // instance variable

    public void function1(){
        int x = 200; // local variable

        System.out.println("inside function1 of PracticeThree");
        System.out.println(this);
        System.out.println("this.x " +this.x);
        System.out.println("x "+x);
    }

    public static void main(String[] args) {

        Practice3 pt = new Practice3();

        pt.function1();
    }
}
