package org.leetcode.solutions.Top_K_Frequent_Elements;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class SolutionTest {

    @Test
    void topKFrequent() {
        int[] nums = new int[]{1,1,1,2,2,3};
        int k = 2;
        int[] correct = new int[]{1,2};

        Assertions.assertArrayEquals(correct, Solution.topKFrequent(nums, k));



    }
}