package com.p11_strings;

public class StringCreation {

    public void createStringObj(){
    //  1) String literals
        String s1 = "welcome";
        String s2 = "welcome";

        System.out.println(s1 == s2); //ture

    //  2) by new keyword
        String s3 = new String("welcome");
        System.out.println(s1 == s3); // false
    }

    public static void main(String[] args) {

        StringCreation ms = new StringCreation();

        ms.createStringObj();
    }
}
