package com.p93_exceptions;

public class MultiCatchBlock {

    public static void main(String[] args) {

        try{
            int arr[] = new int[5];
//            arr[2] = 40;
//             arr[6] = 30/0; // catch: ArithmeticException
            // arr[6] = 30/2; // catch: ArrayIndexOutOFBoundsException

            // Note: once exception occurred rest of the code of try block won't execute

            arr = null;
            int arrLength = arr.length; // catch: NullPointerException: parent exception will catch

            System.out.println("end of try block");
        }catch (ArithmeticException ae){
            System.out.println("Arithmetic Exception occured : "+ae.getMessage());
        }catch (ArrayIndexOutOfBoundsException aiob){
            System.out.println("Array Index Out of Bounds Exception occured : ");
        }catch (Exception e){
            System.out.println("parent Exception occured");
        }finally {
            System.out.println("finally : resourse closed");
        }

        System.out.println("rest of the code...");
    }
}
