package com.p4_oops;

public class PracticeOne {

    int x = 10;

    public static void main(String[] args) {
        PracticeOne p1 = new PracticeOne();
        p1.x = 50;

        // sout - short cut for System.out.println()
        System.out.println(p1.x); // 50

        PracticeOne p2 = new PracticeOne();
        System.out.println(p2.x); //10

        PracticeOne p3 = p1;
        System.out.println(p3.x); //50

        PracticeOne p4 = p2;
        System.out.println(p4.x); // 10

        p1 = null; // here java garbage collector will destroy the object p1
        System.out.println(p1.x); // null point exception
    }
}
