package com.p93_exceptions;

public class NestedTryBlock {

    public static void main(String[] args) {

        try{
            int [] arr  = new int[5];

            try{
                arr[2] = 10/0;
            }catch (ArithmeticException ae){
                System.out.println("Inner try-catch handled : "+ae.getMessage());
            }

            arr[10] = 3;
        }catch (ArrayIndexOutOfBoundsException aiob){
            System.out.println("Outer try-catch handled : "+ aiob.getMessage());
        }

        System.out.println("remaining code....");
    }
}
