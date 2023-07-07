package org.leetcode.solutions.isAnagram;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void isAnagram() {
        Assertions.assertTrue(Solution.isAnagram("anagram", "nagaram"));
    }
}