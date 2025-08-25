package com.p0_miscellaneous;

public class Singleton {

    public static Singleton instance;

    private Singleton(){
        System.out.println("singleton instance created");
    }

    private static Singleton getInstance(){
        if(instance == null){ // lazy initialization
            instance = new Singleton();
        }
        return instance;
    }

    public static void main(String[] args) {

        Singleton singletonObj1 = Singleton.getInstance();
        Singleton singletonObj2 = Singleton.getInstance();

        System.out.println(singletonObj1 == singletonObj2); // true → same instance
    }
}
