package com.p16_exceptions;

public class FinallyNotExecutes {

    // some rare case when finally not executes
    public static void main(String[] args) {
        // 1) when System.exit(0); called in try-catch:

        try{
            System.exit(0); // terminated JVM
            // 0 -> normal termination, 1-> abnormal termination, >0: different types of errors
        }finally {
            System.out.println("won't execute...");
        }

        // 2) when JVM crashed (due to OutOFMemoryError, StackOverflowError, native code crash, etc)
        try{
            int arr[] = new int[Integer.MAX_VALUE]; // may cause JVM crash
        }finally {
            System.out.println("finally block: not guaranteed");
        }

        // 3) In multithreaded env thread is forcibly stopped (not recommended)

        // 4) Infinite loop or deadlock before finally block
        try{
            while(true){}
        }finally {
            System.out.println("finally block : never reached");
        }
        // A deadlock is a situation in multithreaded programming where two or more threads are blocked forever,
        // each waiting for the other to release a lock.

        // 5) Power Failure: machine shutdown


    }

}
