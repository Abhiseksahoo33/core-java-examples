package org.example.array;

import java.util.Arrays;

public class ReverseArray {

    // this logic can be used to reverse any type of array
    public static void main(String[] args) {
        String s = "Abhisek  sahoo";
        char[] ch = s.toCharArray();
        int i = 0;
        int j = ch.length - 1;

        while (i < j) {
            char temp = ch[i];
            ch[i] = ch[j];
            ch[j] = temp;

            i = i + 1;
            j = j - 1;
        }

        System.out.println(Arrays.toString(ch));  //[o, o, h, a, s,  ,  , k, e, s, i, h, b, A]

    }
}