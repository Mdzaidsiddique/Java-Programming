package com.p12_arrays;

public class Array1D {
//  array: used to store multiple values in a single variable
//  array declaration: int[] arr;

    public void arraybasics(){

        int [] defaultmakrs = new int[5];
//      Note: at the time of creating an array object, all the variables inside the array will be
//      initialized with their default value.

        System.out.println(defaultmakrs[2]); // 0 (default value of int)

        int [] marks = {100, 200, 300, 400, 500};

        System.out.println(marks); // it will print address of the object
        System.out.println(marks.length); // size of the array (length: a non-static variable inside array obj)
//      System.out.println(marks[10]); // Exception: ArrayIndexOutOfBoundException

    }

    public void waysToCreateArrays(){
//      1) using new keyword (in this approach first declare and then initialized)
        
        int[] marks = new int[5];

        for(int i=0; i<5; i++){
            marks[i] = i+1;
            System.out.println("at index "+i+ " marks is " +marks[i]);
        }

//      2) using curly bracket {}: declare and initialize at single statement
        int[] marks1 = {100, 200, 300, 400, 500};

        for (int i = 0; i < marks.length; i++) System.out.println("at index " + i + " makrs " + marks1[i]);

    }

    public void arrayForEachLoop(){

        int [] marks = {100, 200, 300, 400, 500, 450};

        for( int mark : marks){ // for each loop
            System.out.println(mark);
        }
    }


    public static void main(String[] args) {

        Array1D a = new Array1D();

        a.arraybasics();
        a.waysToCreateArrays();
        a.arrayForEachLoop();

    }
}
