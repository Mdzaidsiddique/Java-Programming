package com.p93_exceptions;

public class PracticeCustomException {

    public void tempCustom() throws MyCustomException{
        int a = 10;
        int b = 0;
        if(b == 0){
            throw new MyCustomException("my custom exception thrown...");
        }
        System.out.println("division is : "+ a/b);
    }

    public void tempCustom2() throws MyCustomException{
        try{
            int a = 10/0;
        }catch (ArithmeticException e){
            throw new MyCustomException("this is my custom exception");
        }
    }


    public static void main(String[] args) {
        PracticeCustomException t = new PracticeCustomException();

        try{
//            t.tempCustom();
            t.tempCustom2();
        }catch (MyCustomException mce){
            System.out.println(mce.getMessage());
        }

        System.out.println("rest of the code...");
    }

}
