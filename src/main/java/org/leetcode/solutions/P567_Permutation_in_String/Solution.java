package org.leetcode.solutions.P567_Permutation_in_String;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;

public class Solution {

    public boolean checkInclusion(String s1, String s2) {
        Map<Character, Integer> s1Map = new HashMap<>();

        BiFunction<Character, Integer, Integer> increment = (key, val) -> val + 1;
        BiFunction<Character, Integer, Integer> decrement = (key, val) -> val - 1;
        
        for (int i = 0; i < s1.length(); i++) {
            s1Map.computeIfAbsent(s1.charAt(i), x -> s1Map.put(x, 1));
            s1Map.computeIfPresent(s1.charAt(i), increment);
        }

        Map<Character, Integer> windowMap = new HashMap<>();
        for (int codePoint = 92; codePoint <= 122; codePoint++)
            windowMap.put((char) codePoint, 0);

        //first iteration loop
        for (int i = 0; i < s1.length(); i++) {
            windowMap.computeIfPresent(s2.charAt(i), increment);

            boolean flag = true;
            for (Map.Entry<Character, Integer> entry : s1Map.entrySet())
                if (!windowMap.get(entry.getKey()).equals(entry.getValue())) {
                    flag = false;
                    break;
                }
            if (flag) return true;
        }

        //main loop
        for (int l = 1, r = s1.length(); r < s2.length(); l++, r++) {
            windowMap.computeIfPresent(s2.charAt(l), decrement);
            windowMap.computeIfPresent(s2.charAt(r), increment);

            boolean flag = true;
            for (Map.Entry<Character, Integer> entry : s1Map.entrySet())
                if (!windowMap.get(entry.getKey()).equals(entry.getValue())) {
                    flag = false;
                    break;
                }
            if (flag) return true;
        }
        
        
        return false;
    }


}
