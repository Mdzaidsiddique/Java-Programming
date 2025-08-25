package com.p12_arrays;

import java.util.Arrays;

public class Practice1 {

    public int[] reverseArray(int[] arr){

        int[] reversedArray = new int[arr.length];

        for(int i=arr.length-1; i>=0; i--){
            reversedArray[arr.length-1-i] = arr[i];
        }
        return reversedArray;
    }

    public static void main(String[] args) {

        Practice1 p = new Practice1();

        int[] arr = {1,2,3,7,4,5};
        int[] array = p.reverseArray(arr);

        for(int i : array){
            System.out.println(i);
        }

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

    }
}
