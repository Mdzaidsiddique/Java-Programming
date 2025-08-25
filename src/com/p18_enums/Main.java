package com.p18_enums;

public class Main {

    public void printEnums(Grocery grocery){

        if (grocery != null) {
            System.out.println("our service is available");

            grocery.message();
            grocery.info();

        }else{
            System.out.println("invalid enums provided, service is not available");
        }
    }

    public static void main(String[] args) {

        // Grocery
        System.out.println(Grocery.SALT); //SALT
        Grocery.SUGER.info(); //this is suger
        Grocery.SALT.info(); //this is grocery enums

        Main m1 = new Main();
        m1.printEnums(Grocery.SUGER);
        m1.printEnums(Grocery.SALT);


    }

}
