package org.leetcode.solutions.P76_Minimum_Window_Substring;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    Solution solution = new Solution();

    @Test
    void minWindow1() {
        String s = "ADOBECODEBANC";
        String t = "ABC";
        assertEquals("BANC", solution.minWindow(s,t));
    }


    @Test
    void minWindow2() {
        String s = "a";
        String t = "a";
        assertEquals("a", solution.minWindow(s,t));
    }


    @Test
    void minWindow3() {
        String s = "a";
        String t = "aa";
        assertEquals("", solution.minWindow(s,t));
    }

    @Test
    void minWindow4() {
        String s = "ab";
        String t = "a";
        assertEquals("a", solution.minWindow(s,t));
    }
}