package org.leetcode.solutions.P153_Find_Minimum_in_Rotated_Sorted_Array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    Solution solution = new Solution();

    @Test
    void findMin1() {
        int[] nums = {3,4,5,1,2};
        Assertions.assertEquals(1, solution.findMin(nums));
    }

    @Test
    void findMin2() {
        int[] nums = {4,5,6,7,0,1,2};
        Assertions.assertEquals(0, solution.findMin(nums));
    }

    @Test
    void findMin3() {
        int[] nums = {11,13,15,17};
        Assertions.assertEquals(11, solution.findMin(nums));
    }

    @Test
    void findMin4() {
        int[] nums = {1};
        Assertions.assertEquals(1, solution.findMin(nums));
    }

    @Test
    void findMin5() {
        int[] nums = {1,2,3,4,5};
        Assertions.assertEquals(1, solution.findMin(nums));
    }
}