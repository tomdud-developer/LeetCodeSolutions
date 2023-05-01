package org.leetcode.solutions.romantointeger;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Stack;

public class Solution {
    public static int romanToInt(String s) {
        Stack<String> stringStack = new Stack<>();
        Arrays.stream(s.split("")).forEach(stringStack::push);

        HashMap<String, Integer> valuesMap = new HashMap<>();
        valuesMap.put("I", 1);
        valuesMap.put("V", 5);
        valuesMap.put("X", 10);
        valuesMap.put("L", 50);
        valuesMap.put("C", 100);
        valuesMap.put("D", 500);
        valuesMap.put("M", 1000);

        int sum = 0;

        String lastElement = "";
        while(!stringStack.isEmpty()) {

            String newElement = stringStack.pop();

            if((lastElement.equals("V") || lastElement.equals("X")) && newElement.equals("I") ||
                    (lastElement.equals("L") || lastElement.equals("C")) && newElement.equals("X") ||
                        (lastElement.equals("D") || lastElement.equals("M")) && newElement.equals("C")
            ) {
                sum -= valuesMap.get(newElement);
            } else {
                sum += valuesMap.get(newElement);
            }

            lastElement = newElement;
        }

        return sum;
    }
}