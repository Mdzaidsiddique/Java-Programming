package com.p9_polymorphism;

public class Practice1 {

    // compile time polymorphism

    int add(int a, int b){
        return a+b;
    }

    double add(double a, double b){
        return a+b;
    }

    public static void main(String[] args) {
        Practice1 p = new Practice1();
        System.out.println(p.add(1,2)); // 3
        System.out.println(p.add(1.2, 2.3)); //3.5
    }
}
