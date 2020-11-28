package org.example.array;

public class TwoDArrayIndexand_i_jsearch {
    public static void main(String[] args) {
        int[][] two_d_array = {
                {2,4,5,},
                {123,45,5},
                {34,45,25}
        };

        int i = 2;
        int j = 1;
        System.out.println(two_d_array[i][j]);
        int index = two_d_array[0].length * i + j;
        System.out.println(index); // 7

        int tempi = index / two_d_array[0].length;
        int tempj = index % two_d_array[1].length;

        System.out.println(tempi); //2
        System.out.println(tempj);//11


    }
}
