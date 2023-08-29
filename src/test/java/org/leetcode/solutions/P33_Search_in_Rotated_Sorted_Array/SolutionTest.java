package org.leetcode.solutions.P33_Search_in_Rotated_Sorted_Array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    Solution solution = new Solution();

    @Test
    void search1() {
        //given
        int[] nums = {4,5,6,7,0,1,2};
        int target = 0;

        //when
        int result = solution.search(nums, target);

        //then
        Assertions.assertEquals(4, result);
    }

    @Test
    void search2() {
        //given
        int[] nums = {4,5,6,7,0,1,2};
        int target = 3;

        //when
        int result = solution.search(nums, target);

        //then
        Assertions.assertEquals(-1, result);
    }

    @Test
    void search3() {
        //given
        int[] nums = {1};
        int target = 0;

        //when
        int result = solution.search(nums, target);

        //then
        Assertions.assertEquals(-1, result);
    }
}