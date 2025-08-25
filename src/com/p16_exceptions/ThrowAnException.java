package com.p16_exceptions;

import java.io.IOException;

public class ThrowAnException {

    /* throwing an unchecked exception:
        - these exceptions are not checked at compile-time (NullPointer, Arithmetic, etc.)
        - Unchecked exceptions don’t require any handling or declaration
        - You are not forced to write a try-catch block or throws declaration */

    public void myMethod() {
        throw new NullPointerException("Something went wrong");
    }

    public void validageAge(int age){
        if(age<18){
            throw new ArithmeticException("Not eligible for vote");
        }else{
            System.out.println("eligible for vote");
        }
    }

    /* throwing a checked exception:
        - These are exceptions checked at compile-time (e.g., IOException, SQLException)
        - if you throw them using throw, you must handle it with:
            - try-catch block, or
            - declare it in the method signature using throws
        - Checked exceptions must be handled or declared in the method signature */

    // using throws
    public void throwingCheckedException() throws IOException{
        throw new IOException("checked exception");
    }

    // OR using try-catch
    public void myCheckedException(){
        try{
            throw new IOException("checked exception");
        }catch (IOException e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        ThrowAnException te = new ThrowAnException();

        // unchecked exception
        try{
            te.validageAge(15);
        }catch (ArithmeticException e){
            System.out.println("exception handled");
        }

        try{
            te.myMethod();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }

        // checked exception
        try{
            te.throwingCheckedException();
            te.myCheckedException();
        }catch (Exception e){
            System.out.println("this is how we can handle it");
        }

        System.out.println("rest of the code");
    }

    // In short:
    // Unchecked exceptions don’t require any handling or declaration.
    // Checked exceptions must be handled or declared in the method signature.
}
