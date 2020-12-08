package org.example.logicalProgramming;

import java.util.Arrays;

public class MergingTwoSortedArray {
    public static void merging(int[]arr1,int[]arr2) // it will catch the values of the two arrays ..
    {
        // displaying the two array before sorting
        System.out.println("arr1[] : "+ Arrays.toString(arr1));
        System.out.println("arr2[] : "+ Arrays.toString(arr2));



while(true)
{
       int v1 = arr1[arr1.length-1];    // last element of arr1
            int v2 =  arr2[0] ;               //first element of arr2
    if(v1<=v2) // will check the last element of arr1 and the first element of arr2 whether it is v1< v2 or not
        break;
    else
    {
        insertAtFirst(arr2,v1);
        insertAtLast(arr1,v2);
        System.out.println("==========================");
        System.out.println("sorted arr1 :"+Arrays.toString(arr1));
        System.out.println("sorted arr2 :"+Arrays.toString(arr2));
    }
}
    }
 // insertion sorting used ...
    private static void insertAtFirst(int[] arr2, int v1) {
        int n2 = arr2.length;
        int temp = 0;
        arr2[0]=v1;
        for (int j = 1; j < n2; j++) {
            int key = arr2[j];
            int i = j-1;
            while ( (i>=0) && ( arr2[i] > key ) ) {
                arr2 [i+1] = arr2 [i];
                i--;
            }
            arr2[i+1] = key;
        }
    }


    private static void insertAtLast(int[] arr1, int v2) {
       int n1=arr1.length;
       arr1[n1-1]=v2;
       int temp=0;
        for (int j = n1-2; j >=0; j--) {
            int key = arr1[j];
            int i = j+1;
            while ( (i <n1) && ( arr1[i] < key ) ) {
                arr1 [i-1] = arr1 [i];
                i++;
            }
            arr1[i-1] = key;
        }
    }

   /* public static void main(String[] args) {
        int arr1[]= {2, 5, 10, 15, 20};
        int arr2[]={10, 12, 13};
        merging(arr1,arr2);
    }*/
}
/*sorted arr1 :[2, 5, 10, 10, 12]
sorted arr2 :[13, 15, 20]*/