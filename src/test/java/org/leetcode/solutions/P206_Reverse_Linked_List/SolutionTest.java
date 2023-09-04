package org.leetcode.solutions.P206_Reverse_Linked_List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void reverseList1() {
        Solution solution = new Solution();

        solution.reverseList(new ListNode(1, new ListNode(2, new ListNode(3, new ListNode(4, null)))));

    }
}