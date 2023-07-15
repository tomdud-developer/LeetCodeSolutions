package org.leetcode.solutions.Container_With_Most_Water;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void maxArea1() {
        int[] heights = new int[]{1,8,6,2,5,4,8,3,7};

        Assertions.assertEquals(49, Solution.maxArea(heights));
    }

    @Test
    void maxArea2() {
        int[] heights = new int[]{1,1};

        Assertions.assertEquals(1, Solution.maxArea(heights));
    }
}