package org.leetcode.solutions.Group_Anagrams;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

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
    @Test
    void groupAnagrams() {
        Solution solution = new org.leetcode.solutions.Group_Anagrams.Solution();
        List<List<String>> correctArray = new ArrayList<>();
        correctArray.add(List.of("eat", "tea", "ate"));
        correctArray.add(List.of("bat"));
        correctArray.add(List.of("nat","tan"));
        List<List<String>> givenArray =
                solution.groupAnagrams(new String[]{"eat","tea","tan","ate","nat","bat"});

        Assertions.assertTrue(correctArray.get(0).containsAll(givenArray.get(0)));
        Assertions.assertTrue(correctArray.get(1).containsAll(givenArray.get(1)));
        Assertions.assertTrue(correctArray.get(2).containsAll(givenArray.get(2)));
    }
}