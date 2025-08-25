package com.p16_exceptions;

public class ExceptionPropagation {

    public void fun2(){
        fun1();
    }

    public void fun1(){
        int data = 50/0;
    }

    public void fun3(){
        try{
            fun2();
        }catch (ArithmeticException e){
            System.out.println(e.getMessage()+" : handled properly");
            e.printStackTrace(); //call stack order: main, fun3, fun2, fun1
        }
    }

    public static void main(String[] args) {
        ExceptionPropagation ep = new ExceptionPropagation();

        ep.fun3();


        System.out.println("rest of the code...");

    }

}
