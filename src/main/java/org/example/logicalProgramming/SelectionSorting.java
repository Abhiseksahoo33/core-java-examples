package org.example.logicalProgramming;

import java.util.Arrays;

public class SelectionSorting {

   static void  selectionsorting(int[] arr)
    {
        System.out.println("Before sorting : "+ Arrays.toString(arr));


        for (int i = 0; i < arr.length - 1; i++)
        {
            //searching for lowest value
            int index = i;
            for (int j = i + 1; j < arr.length; j++){
                if (arr[j] < arr[index]){
                    index = j;
                }
            }
            // swapping between the smallest number and the inde
            int temp = arr[index];
            arr[index] = arr[i];
            arr[i] = temp;
        }
        System.out.println("after sorting: "+Arrays.toString(arr));


    }


    public static void main(String[] args) {
int[] arr={4,1,8,5,7,3,6};
selectionsorting(arr); // passing the array to tghe selectionmethod .
    }
}


/*output
* Before sorting : [4, 1, 8, 5, 7, 3, 6]
after sorting: [1, 3, 4, 5, 6, 7, 8]
* */