package com.p4_oops;

public class Practice2 {

    static int x = 10; // static, belongs to class not object, and all obj share the same copy of x

    public static void main(String[] args) {

        System.out.println(x); // 10

        Practice2 pt1 = new Practice2();
        System.out.println(pt1.x); //10

        Practice2 pt2 = new Practice2();
        pt2.x = 50; // since we set the static variable and all the object/instance share the same copy of x
        System.out.println(pt2.x +" "+ x + " "+ pt1.x); // hence will get 50 50 50

        pt1 = null;
        System.out.println(pt1.x); // 50 because x is class level (static) variable
        // Java allows you to access a static variable via an instance (even if it's null), but this is not good practice.


        /*
        Important Note:
        - Always access static variables or methods using the class name, not the object
        - even though Java technically allows it via an object.
         */
        System.out.println(Practice2.x); //50
    }
}
