package org.leetcode.solutions.P33_Search_in_Rotated_Sorted_Array;

public class Solution {

    public int search(int[] nums, int target) {
        if (nums.length == 1) {
            if (nums[0] == target) return 0;
            else return -1;
        }

        int l = 0, r = nums.length - 1;
        while (l <= r) {
            int m = (l + r) / 2;

            if ( nums[m] == target ) return m;
            else if ( nums[m] > nums[r]) { //Edge on the right
                if ( target < nums[m] && target >= nums[l] )    //and be sure the target is on the left
                    r = m - 1;
                else                       //target is not on the left
                    l = m + 1;
            } else {                       //Edge on the left
                if ( target > nums[m] && target <= nums[r] )    //and be sure the target is on the right
                    l = m + 1;
                else                       //target is not on the right
                    r = m - 1;
            }
        }

        return -1;
    }


}
