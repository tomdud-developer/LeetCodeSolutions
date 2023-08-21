package org.leetcode.solutions.P74_Search_a_2D_Matrix;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void searchMatrixTest() {

        int[][] array = new int[][] {
                {1,3,5,7},
                {10,11,16,20},
                {23,30,34,60}
        };

        Assertions.assertTrue(Solution.searchMatrix(array, 3));
    }

    @Test
    void searchSmallMatrixTest() {

        int[][] array = new int[][] {
                {1}
        };

        Assertions.assertFalse(Solution.searchMatrix(array, 0));
    }

}