package org.leetcode.solutions.romantointeger;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void romanToInt() {
        Assertions.assertEquals(3, Solution.romanToInt("III"));
        Assertions.assertEquals(4, Solution.romanToInt("IV"));
        Assertions.assertEquals(6, Solution.romanToInt("VI"));
        Assertions.assertEquals(11, Solution.romanToInt("XI"));
        Assertions.assertEquals(9, Solution.romanToInt("IX"));
        Assertions.assertEquals(18, Solution.romanToInt("XVIII"));
        Assertions.assertEquals(40, Solution.romanToInt("XL"));
        Assertions.assertEquals(90, Solution.romanToInt("XC"));
        Assertions.assertEquals(140, Solution.romanToInt("CXL"));
        Assertions.assertEquals(400, Solution.romanToInt("CD"));
        Assertions.assertEquals(900, Solution.romanToInt("CM"));
        Assertions.assertEquals(1994, Solution.romanToInt("MCMXCIV"));
    }
}