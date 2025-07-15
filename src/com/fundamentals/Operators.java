package com.fundamentals;

public class Operators {

    int num1 = 5; int num2 = 6;
    int tempAdd = num1 + num2; // here, num1 & num2 are operands and + is operator

    // an operator is a symbol that will perform a particular operations over provided operands

    /* 1) Arithmetic Operators (+, -, *, /, %, ++, --)
        + : addition
        - : substraction
        * : multiplication
        / : division
        % : modulo (reminder)
        ++a, --a : pre increment, decrement (first add/subs then assign the result to the variable 'a')
        a++, a-- : post increment, decrement (first perform action with 'a', then add/subs and assign)
     */

    public static void arithmeticOperators(){
        int a = 5;
        System.out.println(a);   // 5
        System.out.println(a++); // post increment -> print 5, then +1 added (output 5)
        System.out.println(++a); // pre increment -> +1 added, then print (output 7)
        System.out.println(a--); // 7
        System.out.println(--a); // 5
    }

    // 2) Assignment Operators (=, +=, -=, *=, /=, %=)

    // 3) Comparison Operators (==, !=, <, >, <=, >=)

    //4) Boolean Logical Operators (&, |, ^)

    /* 5) Bitwise Logical Operators (&, |, ^, <<, >>)
        & search for last truthy value or first falsy value (i.e: if any falsy value -> false)
        | search for first truthy value (i.e: if any truthy value -> true)
        ^ if any true -> true, if both true/false -> false
     */

    /* 6) Short Circuit Operators (&&, ||)
        - the main intention of ss operator to improve java application performance
        || -> if first operands is true it returns true (no need to search further) (reduce time & improve performance)
        |  -> even if first operands is true, still JVM evaluate all operands value (more execution time)

        Note: If the first operand value is false then it is mandatory for JVM to evaluate second operand value
              in order to get overall expression result.
     */


    //7) Ternary Operators (exp1? exp2? exp3)

    public static void main(String[] args){
        Operators opt = new Operators();
//        System.out.print(opt.num1++);

        int a = 10;
        int b = 10;

        if((a++ == 10) | (b++ == 10)){
            System.out.println(a+" "+b); // 11 11
        }

        int c = 10;
        int d = 10;

        if((c++ == 10) || (d++ ==10)){
            System.out.println(c+" "+d); // 11 10
        }
    }
}
