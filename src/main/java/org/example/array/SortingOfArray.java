package org.example.array;

import java.lang.reflect.Array;
import java.util.Arrays;

public class SortingOfArray {
    public static void main(String[] args) {
        int arr[]={1,4,5,6,8,3,67,4};
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr)); //[1, 3, 4, 4, 5, 6, 8, 67]
    }
}
