package org.leetcode.solutions.P4_Median_of_Two_Sorted_Arrays;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class  SolutionTest {



    @Test
    void findMedianSortedArrays1() {
        Solution solution = new Solution();

        Assertions.assertEquals(10.5, solution.findMedianSortedArrays(
                new int[]{3,4,5,6,10,15,19,40},
                new int[]{1,2,4,8,11,12,17,20,30,50}
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

    @Test
    void findMedianSortedArrays4() {
        Solution solution = new Solution();

        Assertions.assertEquals(3.5, solution.findMedianSortedArrays(
                new int[]{1,2,3,4,5,6,7,8},
                new int[]{1,2,3,4}
        ));
    }

    @Test
    void findMedianSortedArrays5() {
        Solution solution = new Solution();

        Assertions.assertEquals(2, solution.findMedianSortedArrays(
                new int[]{1,3},
                new int[]{2}
        ));
    }
}