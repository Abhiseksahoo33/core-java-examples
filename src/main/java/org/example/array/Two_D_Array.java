package org.example.array;

import java.util.Arrays;


    public class Two_D_Array {



        public static void main(String[] args) {
            int[][] arr = new int[2][3]; // we  cant modify size
            arr[0] = new int[]{1, 2, 3, 4, 5};
            arr[1] = new int[]{2, 4, 6, 8, 10, 11, 12};

            System.out.println(arr.length);
            System.out.println(arr[0].length);
        }

        public static void m8(String[] args) {
            int[][] arr = new int[2][]; // we cant modify size
            arr[0] = new int[]{1, 2, 3, 4, 5};
            arr[1] = new int[]{2, 4, 6, 8, 10, 11, 12};
            //arr[2] = new int[]{2, 4, 6, 8}; // ArrayIndexOutOfBoundsException
        }

        public static void m7(String[] args) {
            // compilation error with size as 3 or 4
            int[][] arr = new int[][]{
                    {1, 2, 3, 4, 5},
                    {2, 4, 6, 8},
                    {6, 8, 9, 10}
            };
            arr[2] = new int[]{2, 4, 6, 9};
            arr[3] = new int[]{2, 4, 6, 9}; //ArrayIndexOutOfBoundsException  as the size (3 and we are reallocating elements to index 3 ) is already initialized

        }

        public static void m6(String[] args) {
            int[][] arr = {
                    {1, 2, 3, 4, 5},
                    {2, 4, 6, 8},
                    {6, 8, 9, 10}
            };

            for (int i = 0; i < arr.length; i++) {
                int[] int1dArray = arr[i];
                for (int j : int1dArray) {
                    System.out.println(j);
                }
                System.out.println("=============================");
            }
        }

        public static void m5(String[] args) {
            int[][] arr = {
                    {1, 2, 3, 4, 5},
                    {2, 4, 6, 8},
                    {6, 8, 9, 10}
            };

            for (int i = 0; i < arr.length; i++) { // length = 3
                System.out.println(Arrays.toString(arr[i]));
            }
        }

        public static void m4(String[] args) {
            int[][] arr = {
                    {2,4,67,8,6},
                    {3,5,7,8,9, 8},
                    {6, 3,5,70}
            };

            for (int[] int1dArray : arr) {
                for (int i : int1dArray) {
                    System.out.println(i);
                }


            }
        }

        public static void m3(String[] args) {
            int[][] arr = {
                    {2,4,67,8,6},
                    {3,5,7,8,9, 8},
                    {6, 3,5,70}
            };

            for (int[] int1d : arr) {
                System.out.println(Arrays.toString(int1d));
            }
        }

        public static void m2(String[] args) {
            int[][] arr = {
                    {2,4,67,8,6},
                    {3,5,7,8,9, 8},
                    {6, 3,5,70}
            };

            System.out.println(arr.getClass()); //class [[I

            System.out.println(Arrays.toString(arr[0]));
            System.out.println(arr[0].getClass()); //class [I (i - as it is a integer array)
        }

        public static void m1(String[] args) {

            int[] arr = {34,45,56,67,43,467};

            for (int i : arr) {
                System.out.println(i);
            }
        }

    }
