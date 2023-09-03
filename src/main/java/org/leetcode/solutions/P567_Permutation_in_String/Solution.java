package org.leetcode.solutions.P567_Permutation_in_String;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;

public class Solution {

    public boolean checkInclusion(String s1, String s2) {
        if (s2.length() < s1.length()) return false;

        Map<Character, Integer> s1Map = new HashMap<>();

        BiFunction<Character, Integer, Integer> increment = (key, val) -> val + 1;
        BiFunction<Character, Integer, Integer> decrement = (key, val) -> val - 1;
        
        for (int i = 0; i < s1.length(); i++) {
            s1Map.computeIfPresent(s1.charAt(i), increment);
            s1Map.putIfAbsent(s1.charAt(i), 1);
        }

        Map<Character, Integer> windowMap = new HashMap<>();
        for (int codePoint = 97; codePoint <= 122; codePoint++)
            windowMap.put((char) codePoint, 0);

        //first iteration loop
        for (int i = 0; i < s1.length(); i++) windowMap.computeIfPresent(s2.charAt(i), increment);
        if (checkIfValid(s1Map, windowMap)) return true;

        //main window loop
        for (int l = 1, r = s1.length(); r < s2.length(); l++, r++) {
            windowMap.computeIfPresent(s2.charAt(l - 1), decrement);
            windowMap.computeIfPresent(s2.charAt(r), increment);
            if (checkIfValid(s1Map, windowMap))
                return true;
        }

        return false;
    }

    private boolean checkIfValid(Map<Character, Integer> map1, Map<Character, Integer> map2) {
        for (Map.Entry<Character, Integer> entry : map1.entrySet()) {
            if (!map2.get(entry.getKey()).equals(entry.getValue()))
                return false;
        }
        return true;
    }

}
