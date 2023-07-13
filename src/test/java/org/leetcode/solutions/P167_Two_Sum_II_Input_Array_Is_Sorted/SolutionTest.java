package org.leetcode.solutions.P167_Two_Sum_II_Input_Array_Is_Sorted;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void twoSum() {
        Solution solution = new Solution();

        int[] numbers = new int[]{2,7,11,15};
        int target = 9;

        int[] correct = new int[]{1,2};

        Assertions.assertArrayEquals(correct, solution.twoSum(numbers, target));
    }

    @Test
    void twoSum2() {
        Solution solution = new Solution();

        int[] numbers = new int[]{0,0,3,4};
        int target = 0;

        int[] correct = new int[]{1,2};

        Assertions.assertArrayEquals(correct, solution.twoSum(numbers, target));
    }
}