package org.leetcode.solutions.P167_Two_Sum_II_Input_Array_Is_Sorted;

/*
167. Two Sum II - Input Array Is Sorted

Given a 1-indexed array of integers numbers that is already sorted in non-decreasing order, find two numbers such that they add up to a specific target number. Let these two numbers be numbers[index1] and numbers[index2] where 1 <= index1 < index2 < numbers.length.

Return the indices of the two numbers, index1 and index2, added by one as an integer array [index1, index2] of length 2.

The tests are generated such that there is exactly one solution. You may not use the same element twice.

Your solution must use only constant extra space.
 */

import java.util.Arrays;
import java.util.HashMap;

public class Solution {
    public int[] twoSumBest(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;

        while(right > left) {
            int shouldBe = numbers[left] + numbers[right];
            if (shouldBe < target)
                left++;
            else if(shouldBe > target)
                right--;
            else
                return new int[]{left+1, right+1};
        }

        return new int[]{-1, -1};
    }

    public int[] twoSum(int[] numbers, int target) {
        for (int i = 0; i < numbers.length; i++) {
            int shouldBeFound = target - numbers[i];
            for (int j = i+1; j < numbers.length && numbers[i] <= shouldBeFound; j++) {
                if(shouldBeFound == numbers[j])
                    return new int[]{i+1, j+1};
            }
        }

        return new int[]{-1,-1};
    }


}
