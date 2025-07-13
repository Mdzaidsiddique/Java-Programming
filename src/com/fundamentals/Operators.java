package com.fundamentals;

public class Operators {

    int num1 = 5; int num2 = 6;
    int tempAdd = num1 + num2; // here, num1 & num2 are operands and + is operator

    // an operator is a symbol that will perform a particular operations over provided operands

    // 1) Arithmetic Operators (+, -, *, /, %, ++, --)


    // 2) Assignment Operators (=, +=, -=, *=, /=, %=)

    // 3) Comparison Operators (==, !=, <, >, <=, >=)

    //4) Boolean Logical Operators (&, |, ^)

    //5) Bitwise Logical Operators (&, |, ^, <<, >>)

    //6) Short Circuit Operators (&&, ||)

    //7) Ternary Operators (exp1? exp2? exp3)

    public static void main(String[] args){
        Operators opt = new Operators();
        System.out.print(opt.tempAdd);
    }
}
