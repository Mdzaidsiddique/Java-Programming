package com.p3_statements;

public class TransferStatements {

    public static void breakStatement() {
        /* - bypass flow of execution out of the loop
           - skipp remaining instruction for the current iteration
         */
        for(int i=0; i<=10; i++) {
            System.out.println(i);
            if (i == 5) break;
        }
        System.out.println("this is all about break statement");
    }

    public static void continueStatement() {
        /* - bypass flow of execution to the starting point of the loop
           - skipp remaining instruction for the current iteration
        a
         */
        for(int i=0;i<10;i++){

            if(i==5) {
                continue;
//                System.out.println("Compile time error: unreachable statement"); // error
            }
            System.out.println(i);
        }
        System.out.println("this is all about continue statement");
    }

    public static String returnStatement(String name){
        System.out.print(name);
        return name;
    }

    public static void main(String[] args) {
//        breakStatement();
        continueStatement();
//        returnStatement("zaid alif siddique");
    }

}
