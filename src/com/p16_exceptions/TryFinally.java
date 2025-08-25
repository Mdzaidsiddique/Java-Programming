package com.p16_exceptions;

public class TryFinally {

    public void riskyMethod() throws Exception{

        try{
            System.out.println("inside risky method");
            throw new Exception("something went wrong...");
        }finally {
            System.out.println("finally block: cleaning up resources");
        }
    };

    public static void main(String[] args) {
        TryFinally tf = new TryFinally();

        try{
            tf.riskyMethod();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

}
