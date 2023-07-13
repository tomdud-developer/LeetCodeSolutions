package org.leetcode.solutions.Longest_Consecutive_Sequence;

/*
Given an unsorted array of integers nums, return the length of the longest consecutive elements sequence.

You must write an algorithm that runs in O(n) time.


Example 1:

Input: nums = [100,4,200,1,3,2]
Output: 4
Explanation: The longest consecutive elements sequence is [1, 2, 3, 4]. Therefore its length is 4.
Example 2:

Input: nums = [0,3,7,2,5,8,4,6,0,1]
Output: 9
 */

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;

class Solution {
    public static int longestConsecutive(int[] nums) {
        if(nums.length == 0) return 0;

        Queue<Integer> priorytyQueue = new PriorityQueue<>();
        Arrays.stream(nums).forEach(priorytyQueue::add);

        int prev = priorytyQueue.remove();
        int counter = 1;
        int max = counter;
        for (int q = 0; q < nums.length - 1; q++) {
            int current = priorytyQueue.remove();
            if(current == prev+1)
                counter++;
            else if (current == prev)
                ;
            else {
                if(max < counter)
                    max = counter;
                counter = 1;
            }


            prev = current;
        }

        return max >= counter ? max : counter;
    }
}
