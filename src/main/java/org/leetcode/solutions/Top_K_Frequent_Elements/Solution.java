package org.leetcode.solutions.Top_K_Frequent_Elements;

import java.util.*;
import java.util.stream.Collectors;

public class Solution {
    /*
     Given an integer array nums and an integer k, return the k most frequent elements. You may return the answer in any order.

     Example 1:

     Input: nums = [1,1,1,2,2,3], k = 2
     Output: [1,2]
     Example 2:

     Input: nums = [1], k = 1
     Output: [1]
     */
    public static int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int number : nums) {
            if(map.containsKey(number)) {
                int counter = map.get(number);
                map.put(number, counter + 1);
            } else {
                map.put(number, 1);
            }
        }

        List<Integer> integerList = new ArrayList<>();

        for(int i = 0; i < k; i++) {
            int maxValue = map.values().stream().max(Integer::compareTo).get();
            int maxValueKey = map.entrySet().stream()
                    .filter((e) -> e.getValue() == maxValue)
                    .limit(1)
                    .collect(Collectors.toList())
                    .get(0)
                    .getKey();
            integerList.add(maxValueKey);
            map.remove(maxValueKey);
        }

        return integerList.stream().mapToInt(Integer::intValue).toArray();
    }
}
