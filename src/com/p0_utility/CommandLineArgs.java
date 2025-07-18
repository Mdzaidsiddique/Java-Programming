package com.p0_utility;

public class CommandLineArgs {

    // main method (String[] args)

    public static void main(String[] args) {
        // we can pass CLA as input in our java programme,
        // it will get accepted by args, and then convert into String array (see main method signature)
        // JVM wraps input into args[] and supply to main method

        // right click on class > more run/debug > modify run config > pass CLI args: 10 20

        int num1 = Integer.parseInt(args[0]);
        String num2 = args[1];

        System.out.println(num1 + " "+ num2); // 10 20
    }
}
