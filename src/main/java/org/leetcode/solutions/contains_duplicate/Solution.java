package org.leetcode.solutions.contains_duplicate;


import java.util.HashSet;
import java.util.Set;

class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set<Integer> setOfNumbers = new HashSet<>();

        for (int num : nums)
            if (!setOfNumbers.add(num))
                return true;

        return false;
    }
}