package org.leetcode.solutions.P567_Permutation_in_String;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    Solution solution = new Solution();

    @Test
    void checkInclusion1() {
        String s1 = "ab";
        String s2 = "eidbaooo";
        Assertions.assertTrue(solution.checkInclusion(s1, s2));
    }

    @Test
    void checkInclusion2() {
        String s1 = "ab";
        String s2 = "eidboaoo";
        Assertions.assertFalse(solution.checkInclusion(s1, s2));
    }
}