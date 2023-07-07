package org.leetcode.solutions.P_3_Longest_Substring_Without_Repeating_Characters;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void lengthOfLongestSubstring() {
        Solution solution = new Solution();


        Assertions.assertEquals(3, solution.lengthOfLongestSubstring("dvdf"));

        Assertions.assertEquals(3, solution.lengthOfLongestSubstring("abcabcbb"));
        Assertions.assertEquals(1, solution.lengthOfLongestSubstring("bbbbb"));
        Assertions.assertEquals(3, solution.lengthOfLongestSubstring("pwwkew"));

        Assertions.assertEquals(2, solution.lengthOfLongestSubstring("aab"));


    }
}