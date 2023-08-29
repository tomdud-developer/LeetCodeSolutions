package org.leetcode.solutions.P424_Longest_Repeating_Character_Replacement;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    Solution solution = new Solution();

    @Test
    void characterReplacement1() {
        String s = "ABAB";
        int k = 2;
        Assertions.assertEquals(4, solution.characterReplacement(s, k));
    }

    @Test
    void characterReplacement2() {
        String s = "IMNJJTRMJEGMSOLSCCQICIHLQIOGBJAEHQOCRAJQMBIBATGLJDTBNCPIFRDLRIJHRABBJGQAOLIKRLHDRIGERENNMJSDSSMESSTR";
        int k = 2;
        Assertions.assertEquals(6, solution.characterReplacement(s, k));
    }
}