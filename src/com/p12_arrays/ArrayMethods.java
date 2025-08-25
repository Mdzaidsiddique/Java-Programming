package com.p12_arrays;

import java.util.Arrays;

public class ArrayMethods {

    public static void main(String[] args) {

        int[] numbers = {5, 2, 8, 1};

        // toString
        System.out.println("Original: " + Arrays.toString(numbers));

        // sort
        Arrays.sort(numbers);
        System.out.println("Sorted: " + Arrays.toString(numbers));

        // copyOf
        int[] copied = Arrays.copyOf(numbers, 6);
        System.out.println("Copied: " + Arrays.toString(copied));

        // fill
        Arrays.fill(copied, 4, 6, 99);
        System.out.println("Filled: " + Arrays.toString(copied));

        // equals
        System.out.println("Equals: " + Arrays.equals(numbers, copied));

        // binarySearch (after sorting)
        int index = Arrays.binarySearch(numbers, 8);
        System.out.println("Index of 8: " + index);
    }
}
