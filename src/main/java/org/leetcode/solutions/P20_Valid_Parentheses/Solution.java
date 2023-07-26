package org.leetcode.solutions.P20_Valid_Parentheses;

import java.util.Stack;

public class Solution {

    public boolean isValid(String s) {

        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            if(isOpenBracket(s.charAt(i)))
                stack.push(s.charAt(i));
            else if (stack.isEmpty() || getOpositeToOpen(stack.pop()) != s.charAt(i))
                return false;
        }

        return stack.isEmpty();
    }

    private boolean isOpenBracket(char c) {
        return  c == '{' ||  c == '(' || c == '[';
    }

    private char getOpositeToOpen(char c) {
        switch (c) {
            case '{': return '}';
            case '[': return ']';
            case '(': return ')';
        }

        throw new RuntimeException("Unsupported character");
    }


}
