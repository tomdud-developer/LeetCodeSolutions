package org.leetcode.solutions.P13_3Sum;

import java.util.*;

class Solution {
    /*
    Example 1:

    Input: nums = [-1,0,1,2,-1,-4]
    Output: [[-1,-1,2],[-1,0,1]]
    Explanation:
    nums[0] + nums[1] + nums[2] = (-1) + 0 + 1 = 0.
    nums[1] + nums[2] + nums[4] = 0 + 1 + (-1) = 0.
    nums[0] + nums[3] + nums[4] = (-1) + 2 + (-1) = 0.
    The distinct triplets are [-1,0,1] and [-1,-1,2].
    Notice that the order of the output and the order of the triplets does not matter.
    Example 2:

    Input: nums = [0,1,1]
    Output: []
    Explanation: The only possible triplet does not sum up to 0.
    Example 3:

    Input: nums = [0,0,0]
    Output: [[0,0,0]]
    Explanation: The only possible triplet sums up to 0.
     */

    public static List<List<Integer>> threeSum(int[] nums) {

        Arrays.sort(nums);
        Set<List<Integer>> listSet = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {
            int left = i+1;
            int right = nums.length-1;

            while(left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                if (sum < 0) left++;
                else if (sum > 0) right--;
                else {
                    listSet.add(new ArrayList<>(List.of(nums[i], nums[left], nums[right])));
                    left++;
                    right--;
                }
            }
        }

        return new ArrayList<>(listSet);
    }

    //Time Limit Exceeded
    //309 / 312 testcases passed
    public static List<List<Integer>> threeSumWithHashMap(int[] nums) {
        Map<Integer, List<Integer>> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if(map.containsKey(nums[i]))
                map.get(nums[i]).add(i);
            else
                map.put(nums[i], new ArrayList<>(List.of(i)));
        }

        Set<List<Integer>> setOfLists = new HashSet<>();

        for (int i = 0; i < nums.length-1; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                int searchValue = -(nums[i] + nums[j]);
                List<Integer> foundedList = map.get(searchValue);
                if(foundedList != null) {
                    for (Integer index : foundedList) {
                        if(index > j && index > i) {
                            List<Integer> list = new ArrayList<>();
                            list.add(nums[i]);
                            list.add(nums[j]);
                            list.add(nums[index]);
                            Collections.sort(list);
                            setOfLists.add(list);
                        }
                    }
                }
            }
        }

        return setOfLists.stream().toList();
    }
}
