package org.leetcode.solutions.P42_Trapping_Rain_Water;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;



class SolutionTest {

    @Test
    void trap2() {
        int[] heights = new int[]{0,1,0,2,1,0,1,3,2,1,2,1};

        Assertions.assertEquals(6, Solution.trap(heights));
    }

    @Test
    void trap() {
        int[] heights = new int[]{4,2,0,3,2,5};

        Assertions.assertEquals(9, Solution.trap(heights));
    }

    @Test
    void trap3() {
        int[] heights = new int[]{4,2,3};

        Assertions.assertEquals(1, Solution.trap(heights));
    }
}