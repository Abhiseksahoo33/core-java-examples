package org.example.array;

import java.util.Arrays;

public class arrayExamples {
    public static void main(String[] args) {

        arraymethod();
    }
    static void arraymethod(){
        int[] nums = {10, 20, 30, 40};
        int[] nums1 = new int[]{10, 20, 30, 40};
        int[] nums2 = new int[4]; //{10, 20, 30, 40};
        System.out.println(nums2.getClass());
        System.out.println(nums2.hashCode());

        nums1[0] = 500;

        nums2[0] = 100;
        nums2[1] = 200;
        nums2[2] = 300;
        nums2[3] = 400; // n - 1 = 3
        //  nums2[4] = 500;
        System.out.println(Arrays.toString(nums));
        System.out.println(Arrays.toString(nums1));
        System.out.println(Arrays.toString(nums2));

    }
}
