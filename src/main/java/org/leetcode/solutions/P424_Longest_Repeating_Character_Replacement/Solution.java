package org.leetcode.solutions.P424_Longest_Repeating_Character_Replacement;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.Supplier;

public class Solution {


    public int characterReplacement(String s, int k) {
        Map<Character, Integer> counterMap = new HashMap<>();
        for (int i = 65; i <= 90; i++) {
            counterMap.put((char) i, 0);
        }

        int l = 0;
        int max = 0;

        BiFunction<Character, Integer, Integer> increment = (key, val) -> val + 1;
        BiFunction<Character, Integer, Integer> decrement = (key, val) -> val - 1;

        for (int r = 0; r < s.length(); r++) {
            counterMap.computeIfPresent(s.charAt(r), increment);

            int windowLength = r - l + 1;
            while (windowLength - findMax(counterMap) > k) {
                counterMap.computeIfPresent(s.charAt(l), decrement);
                l++;
                windowLength = r - l + 1;
            }

            if ( windowLength > max)
                max = windowLength;
        }

        return max;
    }

    private int findMax(Map<Character, Integer> counterMap) {
        int max = counterMap.get('A');
        for (int i = 66; i <= 90; i++)
            if (counterMap.get((char) i) > max)
                max = counterMap.get((char) i);
        return max;
    }

    public int characterReplacementBad(String s, int k) {

        Map<Character, Integer> counterMap = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            counterMap.computeIfPresent(s.charAt(i), (key, val) -> val + 1);
            counterMap.putIfAbsent(s.charAt(i), 1);
        }

        int max = 0;
        for (Map.Entry<Character, Integer> entry : counterMap.entrySet()) {
            char ch = entry.getKey();
            int counter = 0;
            int holes = 0;
            int l = 0;

            for (int r = 0; r < s.length(); r++) {
                if ( s.charAt(r) == ch ) {
                    counter++;
                    if (holes == 0) l = r;
                }
                else if ( holes < k ) {
                    if (holes == 0)
                    holes++;
                    counter++;
                } else {
                    max = Math.max(max, counter);
                    holes = 0;
                    counter = 0;
                    r = l;
                }
            }
            max = Math.max(max, counter);
        }

        return max;
    }


}
