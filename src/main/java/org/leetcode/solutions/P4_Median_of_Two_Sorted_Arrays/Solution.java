package org.leetcode.solutions.P4_Median_of_Two_Sorted_Arrays;


class Solution {

    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        if (nums1.length == 0) return calculateMedian(nums2);
        if (nums2.length == 0) return calculateMedian(nums1);

        if ( nums1.length > nums2.length ) {
            findMedianSortedArrays(nums2, nums1);
        }

        int l = 0;
        int r = nums1.length - 1;

        while (true) {
            int i = (l+r) / 2;
            int j = (nums1.length + nums2.length)/2 - i - 2;

            double leftEdgeValue1 = i >= 0 ? nums1[i] : Double.NEGATIVE_INFINITY;
            double rightEdgeValue1 = i + 1 < nums1.length ? nums1[i + 1] : Double.POSITIVE_INFINITY;
            double leftEdgeValue2 = j >= 0 ? nums2[j]: Double.NEGATIVE_INFINITY;
            double rightEdgeValue2 = j + 1 < nums2.length ? nums2[j + 1] : Double.POSITIVE_INFINITY;

            if ( leftEdgeValue2 <= rightEdgeValue1
                    && leftEdgeValue1 <= rightEdgeValue2 ) {
                return (nums1.length + nums2.length) % 2 == 0 ?
                        (Math.max(leftEdgeValue1, leftEdgeValue2)
                                + Math.min(rightEdgeValue1, rightEdgeValue2))/ 2.0
                        :
                        Math.min(rightEdgeValue1, rightEdgeValue2);



            } else if (leftEdgeValue1 > rightEdgeValue2) {
                r = i - 1;
            } else {
                l = i + 1;
            }
        }
    }

    private double calculateMedian(int[] arr) {
        int len = arr.length;
        if(len % 2 == 0)
            return (arr[(len / 2)] + arr[(len / 2) - 1]) / 2.0;
        else
            return arr[len / 2];
    }
}
