package org.leetcode.solutions.twosum;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void twoSum() {
        Assertions.assertArrayEquals(new int[]{1,2}, Solution.twoSum(new int[]{3,2,4}, 6));
    }
}