package org.leetcode.solutions.P74_Search_a_2D_Matrix;


public class Solution {

    public static boolean searchMatrix(int[][] matrix, int target) {

        int width = matrix[0].length;
        int height = matrix.length;;

        if (matrix[0][0] > target) return false;

        int row = 0;
        while (row < height) {
            if ( matrix[row][0] <= target )
                row++;
            else break;
        }
        row--;

        //check last column in row
        if (matrix[row][width - 1] < target) return false;

        //Make standard binary search
        int[] arr = matrix[row];
        int min = 0; int max = arr.length - 1;
        int middle = (max - min) / 2;

        while (max - min >= 0) {
            if (target  == arr[middle]) return true;
            else if (target  > arr[middle]) {
                min = middle + 1;
                middle = min + (max - min) / 2;
            } else if (target < arr[middle]) {
                max = middle - 1;
                middle = min + (max - min) / 2;
            }
        }

        return false;
    }

}
