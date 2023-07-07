package org.leetcode.solutions.medianoftwosortedarrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void findMedianSortedArrays1() {
        Solution solution = new Solution();

        Assertions.assertEquals(9, solution.findMedianSortedArrays(
                new int[]{3,4,5,6,10,19,40},
                new int[]{1,2,4,8,11,12,17,20,30}
        ));
    }

    @Test
    void findMedianSortedArrays2() {
        Solution solution = new Solution();

        Assertions.assertEquals(2.5, solution.findMedianSortedArrays(
                new int[]{1,2},
                new int[]{3,4}
        ));
    }

    @Test
    void findMedianSortedArrays3() {
        Solution solution = new Solution();

        Assertions.assertEquals(1, solution.findMedianSortedArrays(
                new int[]{},
                new int[]{1}
        ));
    }
}