package com.p991_functionalprogramming.inbuiltFI;

import java.util.Set;
import java.util.TreeSet;
import java.util.function.Function;

public class FunctionFI {

    /*
    This interface defines an abstract method which will takes T type of object as parameter
    and returns R type of object
    - public R apply(T t);
     */
    public static void main(String[] args) {

        Function<String, Integer> f1 = strNum -> Integer.parseInt(strNum);
        int num = f1.apply("10");
        System.out.println(num); // 10

        // provide String and get Set<Characters>
        Function<String, Set<Character>> f = name -> {

            Set<Character> charSet = new TreeSet<>();

            for(char c : name.toCharArray()){
                charSet.add(c);
            }
            return charSet;
        };

        System.out.println("the characters in word `ZaidAlif` is : "+ f.apply("ZaidAlif"));

    }
}
