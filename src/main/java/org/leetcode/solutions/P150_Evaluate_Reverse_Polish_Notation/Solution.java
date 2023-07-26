package org.leetcode.solutions.P150_Evaluate_Reverse_Polish_Notation;

import java.util.Stack;

public class Solution {

    Stack<Integer> stack = new Stack<>();

    public int evalRPN(String[] tokens) {
        for (int i = 0; i < tokens.length; i++) {
            if (tokens[i].length() == 1 && tokens[i].codePointAt(0) < 48)
                reduceAndPushNewValue(tokens[i]);
            else
                stack.push(Integer.parseInt(tokens[i]));
        }

        return stack.pop();
    }

    private void reduceAndPushNewValue(String operator) {
        int secondValue = stack.pop();
        int firstValue = stack.pop();

        switch (operator) {
            case "+" -> stack.push(firstValue + secondValue);
            case "-" -> stack.push(firstValue - secondValue);
            case "/" -> stack.push(firstValue / secondValue);
            case "*" -> stack.push(firstValue * secondValue);
        }
    }

}
