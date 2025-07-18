package com.p9_scannerclass;

import java.util.Scanner;

public class ScannerClass {

//    static Scanner sc = new Scanner(System.in);
//    system.in can leak the information if not properly closed
//    it's recommended to create inside main method and pass it to methods

    public String takeInput(Scanner sc) {

        System.out.println("Please enter your name :");

        String name = sc.nextLine(); // whole line
//        String name = sc.next(); // till whitespaces
        return "Your name is : "+name;

    }
    public int readInt(Scanner sc){
        System.out.println("enter first number : ");
        int num1 = sc.nextInt();

        System.out.println("Enter 2nd number : ");
        int num2 = sc.nextInt();

        return num1 + num2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ScannerClass sc1 = new ScannerClass();
        System.out.println(sc1.takeInput(sc));
        System.out.println(sc1.readInt(sc));

        sc.close(); // always close scanner - good practice
    }
}
