package com.temp;

public class Temp {

    public static void main(String[] args){
        System.out.println("hello world!");

        String greet = sayHi("zaid");
        System.out.println(greet);

        addTowNumbers(10, 15);
    }

    public static String sayHi(String name){
        return "Hi " + name +" greetings of the day";
    }


    public static int addTowNumbers(int num1, int num2){
        int result = num1+num2;

        System.out.println(result);

        return result;
    }




}
