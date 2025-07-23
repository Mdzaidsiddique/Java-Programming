package com.p11_strings;

public class Practice1 {

    public String reverseString(String str){
        String reverse = "";

        for(int i=str.length()-1; i>=0; i--){
            reverse += str.charAt(i);
        }
        return reverse;
    }

    public void splitStringBasedOnChar(String str){

        String[] splittedStrArr = str.split("\\s+");

        for(String s : splittedStrArr){
            System.out.println(s);
        }
    }

    public String trimString(String str){
        return str.trim();
    }

    public String replaceWsWithUnderscore(String str){
        return str.replace(" ", "_");
    }

    public int getIndex(String str){
        return str.indexOf('a'); // case-sensitive: 'a' & 'A' is not same
    }

    public static void main(String[] args) {

        Practice1 p = new Practice1();

        System.out.println(p.reverseString("alif"));

        p.splitStringBasedOnChar("zaid alif siddique");

        System.out.println(p.trimString("  zaid alif    "));

        System.out.println(p.replaceWsWithUnderscore("Hello Dear how are you?"));

        System.out.println("index of a is : "+p.getIndex("JAva"));
    }
}
