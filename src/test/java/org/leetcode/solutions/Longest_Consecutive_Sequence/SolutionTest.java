package org.leetcode.solutions.Longest_Consecutive_Sequence;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void longestConsecutive() {
        int[] nums = new int[]{100,4,200,1,3,2};
        Assertions.assertEquals(4, Solution.longestConsecutive(nums));
    }

    @Test
    void longestConsecutive2() {
        int[] nums = new int[]{0,3,7,2,5,8,4,6,0,1};
        Assertions.assertEquals(9, Solution.longestConsecutive(nums));
    }
    @Test
    void longestConsecutive3() {
        int[] nums = new int[]{1,2,0,1};
        Assertions.assertEquals(3, Solution.longestConsecutive(nums));
    }

    @Test
    void longestConsecutiveEmpty() {
        int[] nums = new int[]{};
        Assertions.assertEquals(0, Solution.longestConsecutive(nums));
    }
}