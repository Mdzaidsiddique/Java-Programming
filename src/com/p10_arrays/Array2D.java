package com.p10_arrays;

public class Array2D {

    public static void main(String[] args) {

//   2D array: arrays of array (Multi-dimensional array)
//           - each element of a multidimensional array is an array itself


        int[][] matrix = new int[3][4];

        int[][] a = {
                {1,2,3},
                {4,5,6},
                {7,8,9},
            };

        for(int i = 0; i<a.length; i++){
            for(int j = 0; j<a[i].length; j++){
                System.out.println(a[i][j]);
            }
        }

    }
}
