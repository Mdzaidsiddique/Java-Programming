package com.a_fundamentals;

public class Comment {
    // convention to provide description about code/ implementation and for that we use comment section

    /*
        - in Java, comments are completely ignored by the compiler.
        - They are only meant for human readers to understand the code better and have no effect on how the program runs.
     */


    // 1) single line comment: // ............description..

    // 2) MultiLine Comment:
    /*
         It ...
         can ...
         span ...
         across multiple lines.
    */


    // 3) Documentation Comment: Used to generate HTML documentation for code (especially classes/methods).
    //  - to generate HTML documentation (open terminal on current folder-> javadoc Calculator.java)

    /**
     * This method returns the sum of two numbers.
     */
    public static int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args){

        System.out.println("Here is the result : "+add(5,6));
    }

}
