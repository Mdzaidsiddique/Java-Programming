package com.p93_exceptions;

public class Exception2 {
//there are 5 keywords in java to play with exception & these can't be used outside method

    // can be used inside static block
    static{
        try{
            int a = 10/0;
            System.out.println(a);
        }catch (ArithmeticException ae){
            System.out.println(ae);
        }finally {
            int a = 0;
            System.out.println(a);
        }
    }

    // can be used inside constructor
    public Exception2(int totalExpKw) throws Exception{

        try{
            if(totalExpKw != 5){
                throw new Exception("total exception keyword in java must be 5");
            }
            System.out.println("total exception kw is : "+totalExpKw);
        }catch (Exception e){
            System.out.println("caught is contructor : "+ e.getMessage()); //  caught is contructor : total exception keyword in java must be 5

            // here we can re through and handle when method calls to utilize throws kw in signature
            throw e;
        }finally {
            System.out.println("finally block executed");
        }

    }

    // can be used inside methods
    public void fun1(Object o) throws NullPointerException{
        System.out.println(o.toString()); // may be user pass null object
    }

    public static void main(String[] args) {

        try{
            Exception2 ekw = new Exception2(4);
            ekw.fun1(null);
        }catch (Exception e){
            System.out.println(e.getMessage()); // total exception keyword in java must be 5
        }

        // try with finally
        try{
            int a = 10/0; // this line will cause exception
        }finally {
            System.out.println("will handle exception later"); // this will execute no matter exception occur ot not
        }
        System.out.println("the programme is finished"); // this won't execute
    }

}
