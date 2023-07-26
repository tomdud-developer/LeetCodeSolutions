package org.leetcode.solutions.P150_Evaluate_Reverse_Polish_Notation;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void evalRPN() {
        Solution solution = new Solution();

        String[] tokens = new String[]{"2","1","+","3","*"};
        int result = solution.evalRPN(tokens);

        Assertions.assertEquals(9, result);
    }

    @Test
    void evalRPN2() {
        Solution solution = new Solution();

        String[] tokens = new String[]{"4","13","5","/","+"};
        int result = solution.evalRPN(tokens);

        Assertions.assertEquals(6, result);
    }

    @Test
    void evalRPN3() {
        Solution solution = new Solution();

        String[] tokens = new String[]{"10","6","9","3","+","-11","*","/","*","17","+","5","+"};
        int result = solution.evalRPN(tokens);

        Assertions.assertEquals(22, result);
    }
}