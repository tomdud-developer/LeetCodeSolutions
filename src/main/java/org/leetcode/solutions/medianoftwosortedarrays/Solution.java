package org.leetcode.solutions.medianoftwosortedarrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if(nums1.length == 0) return calculateMedian(nums2);
        if(nums2.length == 0) return calculateMedian(nums1);

        System.out.println(Arrays.toString(nums1));
        System.out.println(Arrays.toString(nums2));

        double median1 = calculateMedian(nums1);
        double median2 = calculateMedian(nums2);

        if ( median1 == median2 ) return median1;

        List<Integer> list1 = new ArrayList<>();

        if( median1 < median2 ) {

            for(int i = nums1.length / 2 ; i < nums1.length && nums1[i] < median2 ; i++)
                list1.add(nums1[i]);


            for (int i = nums2.length / 2; i > -1 && nums2[i] > median1 ; i--)
                list1.add(nums2[i]);

        }



        int[] arr = list1.stream().mapToInt(Integer::intValue).toArray();
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));

        return calculateMedian(arr);
    }

    private double calculateMedian(int[] arr) {
        int len = arr.length;
        if(len % 2 == 0)
            return (arr[(len / 2)] + arr[(len / 2) - 1]) / 2.0;
        else
            return arr[len / 2];
    }
}
