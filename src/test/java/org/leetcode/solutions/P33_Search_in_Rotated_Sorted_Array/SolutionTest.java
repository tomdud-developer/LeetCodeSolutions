package org.leetcode.solutions.P33_Search_in_Rotated_Sorted_Array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    Solution solution = new Solution();

    @Test
    void search() {
        //given
        int[] nums = {4,5,6,7,0,1,2};
        int target = 0;

        //

        //then
        Assertions.assertEquals(4, solution.search(nums, target));
    }
}