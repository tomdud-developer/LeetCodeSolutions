package org.leetcode.solutions.P875_Koko_Eating_Bananas;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution = new Solution();

    @Test
    void minEatingSpeed1() {
        int[] piles = {3,6,7,11};
        int h = 8;
        Assertions.assertEquals(4, solution.minEatingSpeed(piles, h));
    }

    @Test
    void minEatingSpeed2() {
        int[] piles = {30,11,23,4,20};
        int h = 5;
        Assertions.assertEquals(30, solution.minEatingSpeed(piles, h));
    }

    @Test
    void minEatingSpeed3() {
        int[] piles = {30,11,23,4,20};
        int h = 6;
        Assertions.assertEquals(23, solution.minEatingSpeed(piles, h));
    }

    @Test
    void minEatingSpeedBig() {
        int[] piles;
        try (
                InputStream inputStream = getClass().getClassLoader().getResourceAsStream("aLotOfNumbers_P875.txt");
        ) {
            String str = new String(inputStream.readAllBytes());
            piles = Arrays.stream(str.split(",")).mapToInt(Integer::parseInt).toArray();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        int h = 150639808;
        Assertions.assertEquals(33066, solution.minEatingSpeed(piles, h));
    }


}