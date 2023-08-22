package org.leetcode.solutions.P153_Find_Minimum_in_Rotated_Sorted_Array;

public class Solution {

    public int findMin(int[] nums) {

        if (nums.length == 1) return nums[0];

        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            if(right - left == 1) return Math.min(nums[left], nums[right]);
            int middle = (right + left) / 2;
            if ( nums[middle] >  nums[right])
                left = middle;
            else
                right = middle;
        }

        throw new RuntimeException();
    }

}
