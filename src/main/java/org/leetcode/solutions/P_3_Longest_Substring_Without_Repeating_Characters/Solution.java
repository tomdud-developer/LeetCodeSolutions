package org.leetcode.solutions.P_3_Longest_Substring_Without_Repeating_Characters;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length() == 0) return 0;

        int max = 0;
        int l = 0;
        Set<Character> set = new HashSet<>();

        for (int r = 0; r < s.length(); r++) {
            while (!set.add(s.charAt(r))) {
                set.remove(s.charAt(l));
                l++;
            }
            max = Math.max(max, r - l + 1);
        }

        return max;
    }
}