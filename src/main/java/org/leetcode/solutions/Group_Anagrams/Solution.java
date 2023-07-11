package org.leetcode.solutions.Group_Anagrams;

import java.util.*;

/**
 * Given an array of strings strs, group the anagrams together. You can return the answer in any order.
 *
 * An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.
 *
 *Example 1:
 *
 * Input: strs = ["eat","tea","tan","ate","nat","bat"]
 * Output: [["bat"],["nat","tan"],["ate","eat","tea"]]
 * Example 2:
 *
 * Input: strs = [""]
 * Output: [[""]]
 * Example 3:
 *
 * Input: strs = ["a"]
 * Output: [["a"]]
 */
public class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<Integer, List<String>> hashMap = new HashMap<>();

        for(int i = 0; i < strs.length; i++) {
            char[] charArray = strs[i].toCharArray();
            Arrays.sort(charArray);
            int hashCode = new String(charArray).hashCode();
            if(hashMap.containsKey(hashCode))
                hashMap.get(hashCode).add(strs[i]);
            else
                hashMap.put(hashCode, new ArrayList<>(List.of(strs[i])));
        }

        List<List<String>> groupedAnagrams = new ArrayList<>();
        for(Map.Entry<Integer,List<String>> entry :hashMap.entrySet()) {
            groupedAnagrams.add(entry.getValue());
        }

        return groupedAnagrams;
    }
}
