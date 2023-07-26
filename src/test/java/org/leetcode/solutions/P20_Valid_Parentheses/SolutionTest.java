package org.leetcode.solutions.P20_Valid_Parentheses;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void isValid1() {
        assertTrue(new Solution().isValid("()"));
    }

    @Test
    void isValid2() {
        assertTrue(new Solution().isValid("({[{{{(())}}}]})"));
    }

    @Test
    void isValid3() {
        assertFalse(new Solution().isValid("({[{{{((())}}}]}"));
    }

    @Test
    void isValid4() {
        assertFalse(new Solution().isValid("(((())))}}}"));
    }
}