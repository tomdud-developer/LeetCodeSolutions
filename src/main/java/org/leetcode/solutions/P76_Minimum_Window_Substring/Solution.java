package org.leetcode.solutions.P76_Minimum_Window_Substring;

import java.util.HashMap;
import java.util.Map;
import java.util.function.BiFunction;

public class Solution {
    public String minWindow(String s, String t) {

        if (t.length() > s.length()) return "";
        if (s.length() == 1 && t.length() == 1) {
            if (s.equals(t)) return s;
            else return "";
        }

        BiFunction<Character, Integer, Integer> increment = (key, val) -> val + 1;
        BiFunction<Character, Integer, Integer> decrement = (key, val) -> val - 1;

        Map<Character, Integer> map1 = new HashMap<>();
        for (int i = 0; i < t.length(); i++) {
            map1.computeIfPresent(t.charAt(i), increment);
            map1.putIfAbsent(t.charAt(i), 1);
        }

        Map<Character, Integer> map2 = new HashMap<>();
        for (int codePoint = 65; codePoint <= 90; codePoint++) map2.put((char) codePoint, 0);
        for (int codePoint = 97; codePoint <= 122; codePoint++) map2.put((char) codePoint, 0);

        String res = null;

        for (int l = 0, r = 0; r < s.length(); r++) {
            map2.computeIfPresent(s.charAt(r), increment);

            if (checkIfValid(map1, map2)) {
                while (checkIfValid(map1, map2)) {
                    map2.computeIfPresent(s.charAt(l), decrement);
                    l++;
                }
                String value = s.substring(l - 1, r + 1);
                if (res == null || res.length() > value.length()) res = value;

                //After determine min go to next char, which is in map1

            }
        }

        if (res == null) return "";
        else return res;
    }

    private boolean checkIfValid(Map<Character, Integer> map1, Map<Character, Integer> map2) {
        for (Map.Entry<Character, Integer> entry : map1.entrySet()) {
            if (map2.get(entry.getKey()) < entry.getValue())
                return false;
        }
        return true;
    }

}
