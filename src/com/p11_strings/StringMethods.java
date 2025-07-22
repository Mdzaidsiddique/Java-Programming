package com.p11_strings;

public class StringMethods {

    public static void main(String[] args) {
        String str = "  Hello World  ";

        System.out.println(str.length());              // 15
        System.out.println(str.trim());                // "Hello World"
        System.out.println(str.toLowerCase());         // "  hello world  "
        System.out.println(str.contains("World"));     // true
        System.out.println(str.indexOf("o"));          // 4
        System.out.println(str.replace(" ", "_"));     // "__Hello_World__"
    }
}
