package com.p8_inheritance;

public class ChildClass extends SuperClass{

    // parent class constructor calling using super
    ChildClass(){
        super();
        System.out.println("child class constructor called");
    }


    // calling instance variable of parent class using super kw
    void fun2(){
        System.out.println("instence variable of super class is : "+super.x);
    }

    // invoking parent class instance methods
    void fun3(){
        super.fun1();
        System.out.println("super class methods fun1 called");
    }

}
