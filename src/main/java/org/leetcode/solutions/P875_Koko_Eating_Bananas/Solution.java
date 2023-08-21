package org.leetcode.solutions.P875_Koko_Eating_Bananas;

public class Solution {

    public int minEatingSpeed(int[] piles, int h) {
        int l = 1;
        int r = getMax(piles);
        int mid = 0;

        while ( l < r) {
            int sum = 0;
            mid = (r + l) / 2;
            for (int pile : piles) {
                sum += Math.ceil(pile / (double) mid);
                if (sum > h)
                    break;
            }
            if (sum <= h) r = mid;
            else l = mid + 1;
        }
        return l;
    }


    public int minEatingSpeedBruteForce(int[] piles, int h) {

        int min = 1;

        while (true) {
            int sum = 0;
            for (int i = 0; i < piles.length; i++) {
                sum += Math.ceil(piles[i] / (double)min);
                if (sum > h) {
                    min++;
                    break;
                }
            }
            if (sum <= h) return min;
        }
    }

    int getMin(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (min > arr[i])
                min = arr[i];
        }

        return min;
    }


    int getMax(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i])
                max = arr[i];
        }

        return max;
    }

}
