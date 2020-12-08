package org.example.logicalProgramming;


import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

import static org.example.logicalProgramming.MergingTwoSortedArray.merging;

public class MergingTwoSortedArrayTest  {
@Test
    public void MergingTest() {
    int arr1[]= {2, 5, 10, 15, 20};
    int arr2[]={10, 12, 13};
    merging(arr1,arr2);
    int arr11[]={2,5,10,10,12};
    int arr22[]={13,15,20};
    boolean flag1 = Arrays.equals(arr1,arr11);
    Assert.assertTrue(flag1);
    boolean flag2 = Arrays.equals(arr2,arr22);
    Assert.assertTrue(flag2);

    }
}