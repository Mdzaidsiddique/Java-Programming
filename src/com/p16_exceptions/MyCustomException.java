package com.p16_exceptions;

public class MyCustomException extends RuntimeException{
    // when extends Exception -> Checked Exception
    // when extends RuntimeException -> UncheckedException

    // constructor
    public MyCustomException(String message){
        super(message); // invoking parent class constructor
    }
}
