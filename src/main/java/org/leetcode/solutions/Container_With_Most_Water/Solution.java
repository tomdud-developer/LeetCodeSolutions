package org.leetcode.solutions.Container_With_Most_Water;

public class Solution {

    public static int maxArea(int[] height) {
        int max = 0;
        int left = 0;
        int right = height.length - 1;

        while(left < right) {
            int area = (height[left] < height[right] ? height[left] : height[right]) * (right - left);
            if (area > max) max = area;

            if (height[left] < height[right]) left++;
            else if (height[left] > height[right]) right--;
            else {left++; right--;}
        }

        return max;
    }


    public static int maxAreaCorrectButSlow(int[] height) {
        int max = 0;
        for (int i = 0; i < height.length-1; i++) {
            for (int j = i+1; j < height.length; j++) {
                int area = (height[i] < height[j] ? height[i] : height[j]) * (j - i);
                if (area > max) {
                    System.out.println("" + i + "  " + j);
                    max = area;
                }
            }
        }

        return max;
    }
}
