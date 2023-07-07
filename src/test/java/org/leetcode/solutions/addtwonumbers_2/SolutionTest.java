package org.leetcode.solutions.addtwonumbers_2;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class SolutionTest {

    @Test
    void addTwoNumbers() {
        ListNode listNode1 = new ListNode(2, new ListNode(4, new ListNode(3)));
        ListNode listNode2 = new ListNode(5, new ListNode(6, new ListNode(4)));
        ListNode listNodeResult = new Solution().addTwoNumbers(listNode1, listNode2);

        Assertions.assertArrayEquals(new int[]{7,0,8},
                    new int[]{
                            listNodeResult.val,
                            listNodeResult.next.val,
                            listNodeResult.next.next.val
                    }
                );
    }
}