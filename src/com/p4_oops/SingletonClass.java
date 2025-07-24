package com.p4_oops;

public class SingletonClass {

    public static SingletonClass instance;

    // private constructor to prevent instantiation
    private SingletonClass(){}

    // public static method to provide access of the instance
    public static SingletonClass getInstance(){
        if (instance == null) {
            instance = new SingletonClass();
        }
        return instance;
        //  This is not thread-safe. Two threads can create different instances in a multi-threaded environment
    };

    public static void main(String[] args) {
        SingletonClass sc = SingletonClass.getInstance();
        System.out.println(sc);
    }


}
