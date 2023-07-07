package org.leetcode.solutions.P_3_Longest_Substring_Without_Repeating_Characters;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public int lengthOfLongestSubstring(String s) {
        if(s.length() == 0) return 0;

        String[] arr = s.split("");

        int counter = 0;
        int max = 0;

        Set<String> stringSet = new HashSet<>();

        for(int i = 0; i < arr.length; i++) {
            if(!stringSet.contains(arr[i])) {
                stringSet.add(arr[i]);
                counter++;
            } else {
                if(counter > max) max = counter;
                //Check index of last duplicate character
                i = i - counter +  s.substring(i - counter, i).indexOf(arr[i]);
                if(i < 0) i = 0;
                counter = 0;
                stringSet = new HashSet<>();
            }
        }
        if(counter > max) max = counter;

        return max;
    }
}