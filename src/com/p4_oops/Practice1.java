package com.p4_oops;

public class Practice1 {

    int x = 10;

    public static void main(String[] args) {
        Practice1 p1 = new Practice1();
        p1.x = 50;

        // sout - short cut for System.out.println()
        System.out.println(p1.x); // 50

        Practice1 p2 = new Practice1();
        System.out.println(p2.x); //10

        Practice1 p3 = p1;
        System.out.println(p3.x); //50

        Practice1 p4 = p2;
        System.out.println(p4.x); // 10

        p1 = null; // here java garbage collector will destroy the object p1
        System.out.println(p1.x); // null point exception
    }
}
