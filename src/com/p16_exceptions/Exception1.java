package com.p16_exceptions;

public class Exception1 {

    static {
        try{
            int a = 10/0;
            System.out.println(a);
        }catch (ArithmeticException e){
            System.out.println(e);
        }
    }


    public static void main(String[] args) {
        Exception1 m = new Exception1();
//        System.out.println(a);
    }
}
