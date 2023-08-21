package org.leetcode.solutions.game;

public class Solution {
    static int closestToZero(int[] ints) {

        if(ints == null) return 0;
        if(ints.length == 0) return 0;

        int closest = ints[0];
        boolean shouldReturnPositiveBecauseOfDoubled = false;

        for (int i = 1; i < ints.length; i++) {
            if (Math.abs(closest) > Math.abs(ints[i])) {
                closest = ints[i];
                shouldReturnPositiveBecauseOfDoubled = false;
            } else if (-1 * closest == ints[i]) { //it checks opposite
                shouldReturnPositiveBecauseOfDoubled = true;
            }
        }

        if (shouldReturnPositiveBecauseOfDoubled)
            return Math.abs(closest);
        else return closest;
    }
}
