package org.leetcode.solutions.P42_Trapping_Rain_Water;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {

    public static int trap (int[] height) {
        int area = 0;
        int maxLevel = 0;
        for (int j : height) if (j > maxLevel) maxLevel = j;

        for (int level = 1; level <= maxLevel; level++) {
            List<Integer> list = new ArrayList<>();

            for (int k : height)
                if (k >= level) list.add(1);
                else list.add(0);


            int isBeginAndEnd = 0;
            int left;
            for (left = 0; left < height.length - 1; left++)
                if(list.get(left) == 1) {
                    isBeginAndEnd++;
                    break;
                }


            int right;
            for (right = height.length-1; right > 1; right--)
                if(list.get(right) == 1) {
                    isBeginAndEnd++;
                    break;
                }

            if (isBeginAndEnd == 2 && left < right)
                for (int j = left+1; j < right; j++) {
                    if(list.get(j) == 0)
                        area += 1;
                }
        }
        return area;
    }

    public static int trapSlow (int[] height) {

        int maxLevel = 0;
        for (int i = 0; i < height.length; i++)
            if (height[i] > maxLevel) maxLevel = height[i];


        int area = 0;
        for (int level = 1; level <= maxLevel; level++) {
            int openIndex = -1;
            for (int i = 0; i < height.length - 1; i++) {
                if (height[i] >= level) {
                    openIndex = i;
                    break;
                }
            }

            if(openIndex >= 0)
                for (int i = openIndex+1; i < height.length; i++) {
                    if(height[i] >= level && openIndex < i-1) {
                        area += i - openIndex - 1;
                        openIndex = i;
                    } else if(height[i] >= level && openIndex == i-1) {
                        openIndex = i;
                    }
                }

        }

        return area;
    }
}