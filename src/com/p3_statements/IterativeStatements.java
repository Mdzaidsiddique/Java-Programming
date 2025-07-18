package com.p3_statements;

public class IterativeStatements {

    public static void forLoop() {

        for(int i = 0; i >= 5; i++){
            System.out.println(i);
        }

    }

    public static void whileLoop() {
        int i = 10;
//        while(i >= 0){
//            System.out.println(i);
//            i--;
//        }

        while(i!=0){
            System.out.println(i);
            i--;
        }

    }

    public static void doWhile(){
        // - executes at-least one time (first body executes then condition)
        // - condition executes for the next iteration
        do{
            System.out.println("hey hey boi");
        }while(false);
    }

    public static void main(String[] args) {
        forLoop();
        whileLoop();
        doWhile();
    }
}
