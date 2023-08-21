package org.leetcode.solutions.game;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void exists() {
        int[] ints = { -9, 8, 2, -5, 7 };
        Assertions.assertEquals( 2, Solution.closestToZero(ints));

        int[] ints2 = { -9, 8, 2, -5, 7, -2, -1 };
        Assertions.assertEquals( -1, Solution.closestToZero(ints2));

        int[] ints3 = { -9, 8, 2, -5, 7, -2 };
        Assertions.assertEquals( 2, Solution.closestToZero(ints3));
    }
}