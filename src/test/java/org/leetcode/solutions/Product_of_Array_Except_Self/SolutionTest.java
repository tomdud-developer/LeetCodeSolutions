package org.leetcode.solutions.Product_of_Array_Except_Self;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void productExceptSelf() {
        int[] nums = new int[]{1,2,3,4};

        int[] correct = new int[]{24,12,8,6};

        Assertions.assertArrayEquals(new int[]{24,12,8,6}, Solution.productExceptSelf(nums));
    }
}