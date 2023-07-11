package org.leetcode.solutions.Product_of_Array_Except_Self;

/*
Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].

The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.

You must write an algorithm that runs in O(n) time and without using the division operation.



Example 1:

Input: nums = [1,2,3,4]
Output: [24,12,8,6]

Example 2:

Input: nums = [-1,1,0,-3,3]
Output: [0,0,9,0,0]
 */
public class Solution {
    public static int[] productExceptSelf(int[] nums) {
        int[] fromLeft = new int[nums.length];
        fromLeft[0] = nums[0];
        for (int i = 1; i < nums.length; i++)
            fromLeft[i] = nums[i] * fromLeft[i-1];

        int[] fromRight = new int[nums.length];
        fromRight[nums.length-1] = nums[nums.length-1];
        for (int i = nums.length-2; i >= 0; i--)
            fromRight[i] = nums[i] * fromRight[i+1];

        int[] result = new int[nums.length];
        result[0] = fromRight[1];
        result[nums.length-1] = fromLeft[nums.length-2];
        for (int i = 1; i < nums.length-1; i++)
            result[i] = fromLeft[i-1] * fromRight[i+1];

        return result;
    }
}
