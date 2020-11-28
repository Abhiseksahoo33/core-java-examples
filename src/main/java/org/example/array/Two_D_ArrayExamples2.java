package org.example.array;

import java.util.Arrays;

public class Two_D_ArrayExamples2 {
    public static void main(String[] args) {
        int[] arr = {12,45,67,33,23,56};

        Arrays.stream(arr).forEach(System.out::println);
        System.out.println("#####################################");
        Arrays.stream(arr).forEach(elem->{
            System.out.println(elem);
        });

        System.out.println("##########################################3333");
        int[][] two_d_array = {
                {2,4,5,},
                {123,45,5},
                {34,45,25}
        };

        Arrays.stream(two_d_array).forEach(int1dArray->{
            Arrays.stream(int1dArray).forEach(elem->{
                System.out.println(elem);
            });
            System.out.println("*************************");
        });
    }

    public static void m11(String[] args) {
        int[][] arr = new int[2][3]; // you cant modify size
        arr[0] = new int[]{1, 2, 3};
        arr[1] = new int[]{2, 4, 6, 7};

        for (int i = 0; i < arr.length; i++) {
            int[] int1dArray = arr[i]; // to get 1d array
            for (int j = 0; j < int1dArray.length; j++) {
                System.out.println(int1dArray[j]);
            }
            System.out.println("=======================");
        }
    }

    public static void m10(String[] args) {
        int[][] arr = new int[2][3]; // you cant modify size
        arr[0] = new int[]{1, 2, 3};
        arr[1] = new int[]{2, 4, 6, 7};

        System.out.println(arr[0][0]);
        System.out.println(arr[0][1]);
        System.out.println(arr[0][2]);
        arr[1][3] = 70;
        arr[0][3] = 4;
    }

}
