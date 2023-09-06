package org.leetcode.solutions.P143_Reorder_List;

public class Solution {

    private ListNode currentLeft;

    public void reorderList(ListNode head) {
        if (head == null || head.next == null) return;

        currentLeft = head;

        recursion(head.next);
    }


    private void recursion(ListNode node) {

        if (node == currentLeft) {
            return;
        } else if (node.next == null) {
            node.next = currentLeft.next;
            currentLeft.next = node;
            currentLeft = node.next;
            return;
        } else {
            recursion(node.next);
            node.next = currentLeft.next;
            currentLeft.next = node;
            currentLeft = node.next;
        }
    }
}