package org.leetcode.solutions.P704_Binary_Search;


public class Solution {
    public int search(int[] nums, int target) {

        int start = 0;
        int end = nums.length - 1;
        int middleIndex = (end - start + 1) / 2;

        while (middleIndex >= start && middleIndex <= end) {
            if (nums[middleIndex] == target)
                return middleIndex;
            else if (target > nums[middleIndex]) {
                start = middleIndex + 1;
                middleIndex = start + (end - start + 1) / 2;
            }
            else {
                end = middleIndex - 1;
                middleIndex = end - (end - start + 1) / 2;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        System.out.println(new Solution().search(new int[]{-1,0,3,5,9,12}, 9));
    }

    /*

        public int search(int[] nums, int target) {
        int middleIndex = nums.length%2 == 2 ? nums.length/2-1 : nums.length/2;
        System.out.println(Arrays.toString(nums));
        System.out.println(middleIndex);
        if(nums[middleIndex] == target)
            return middleIndex;
        else if(target > nums[middleIndex])
            return middleIndex + 1 + search(Arrays.copyOfRange(nums, middleIndex+1, nums.length), target);
        else
            return middleIndex + 1 + search(Arrays.copyOfRange(nums, 0, middleIndex), target);
    }
     */
}
