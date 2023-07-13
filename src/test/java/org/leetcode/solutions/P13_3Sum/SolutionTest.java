package org.leetcode.solutions.P13_3Sum;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void threeSum() {
        int[] nums = new int[]{-1,0,1,2,-1,-4};
        int[] correct1 = new int[]{-1,-1,2};
        int[] correct2 = new int[]{-1,0,1};

        List<List<Integer>> givenList = Solution.threeSum(nums);

        Assertions.assertArrayEquals(
                correct1,
                givenList.get(0).stream().mapToInt(Integer::intValue).toArray());

        Assertions.assertArrayEquals(
                correct2,
                givenList.get(1).stream().mapToInt(Integer::intValue).toArray());
    }

    @Test
    void test() {
        List<Integer> list1 = new ArrayList<>(List.of(1,2,3,4,5));
        List<Integer> list2 = new ArrayList<>(List.of(1,2,3,4,5));

        System.out.println(list1.hashCode());
        System.out.println(list2.hashCode());
    }
}