package org.leetcode.solutions.isAnagram;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution {
    public static boolean isAnagram(String s, String t) {
        Map<String, Integer> lettersMapWithCounter = new HashMap<>();

        Arrays.stream(s.split("")).forEach(
            letter -> {
                Integer counter = lettersMapWithCounter.get(letter);
                if(counter != null) lettersMapWithCounter.put(letter, counter + 1) ;
                else lettersMapWithCounter.put(letter, 1);
            }
        );

        for(String letter : t.split("")) {
            Integer counter = lettersMapWithCounter.get(letter);
            if(counter == null) return false;
            else if(counter == 1) {
                lettersMapWithCounter.remove(letter);
            } else {
                lettersMapWithCounter.put(letter, counter - 1);
            }
        }

        return  lettersMapWithCounter.isEmpty();
    }

    public boolean isAnagramBetter(String s, String t) {
        int[] alphabet = new int[26];
        for (int i = 0; i < s.length(); i++) alphabet[s.charAt(i) - 'a']++;
        for (int i = 0; i < t.length(); i++) alphabet[t.charAt(i) - 'a']--;
        for (int i : alphabet) if (i != 0) return false;
        return true;
    }
}
