package com.statements;

public class ConditionalStatements {

    public static void ifElse() {

        int i = 10;
        int j;

        if(i==10){
            j = 20;
        }
        // System.out.println(j); // compile time error: j might not have initialized (Local variables in Java must be initialized before use)
        else if(i==15){
            j = 30;
        }
        else{
            j = 40;
        }
        System.out.println(j);
    }

    public static void switchCase() {
        /*
            - if provides single condition checking
            - switch provides multiple conditions to checking (use case- menu driven application, etc)
            - allowed data types: byte, short, int, char, String
            - in switch, all case and default are optional
         */
        int i = 4;
        switch (i){
            case 5:
                System.out.println("five");
                break; // if we remove break, the next statement will execute
            case 10:
                System.out.println("ten");
                break;
            case 15:
                System.out.println("fifteen");
                break;
            default:
                System.out.println("default");
//                break;
        }
        System.out.print("that all about switch case statements");
    }

    public static void main(String[] args) {
//        ifElse();
        switchCase();
    }
}
