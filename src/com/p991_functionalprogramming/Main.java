package com.p991_functionalprogramming;

public class Main {

    public static void main(String[] args) {

        // 1) using separate class:
        FuncInterface fi1 = new FuncInterfaceImpl();
        fi1.sayHello("Mr zaid");

        // 2) using anonymous inner class:
        FuncInterface fi2 = new FuncInterface() {
            @Override
            public void sayHello(String name) {
                System.out.println("Hello : "+name);
            }
        };

        fi2.sayHello("zaid alif from anonymous inner class");
        fi2.defaultMethod();

        // 3) using lambda expression (most common):
//        FuncInterface fi3 = (name) -> {
//            System.out.println("hello : "+ name);
//        };
        // or:
        FuncInterface fi3 = name -> System.out.println("hello : "+ name);

        fi3.defaultMethod();
        fi3.sayHello("zaid alif siddique from lambda expression");

        // 4) using Method reference (if method signature matches):


        // 5) using constructor reference:


    }
}
