package org.leetcode.solutions.P206_Reverse_Linked_List;

public class Solution {

    ListNode newHead = null;

    public ListNode reverseList(ListNode node) {
        if ( node == null ) return null;
        reverseListRecursion(node, null);
        return newHead;
    }

    public void reverseListRecursion(ListNode node, ListNode prevNode) {
        if (node.next == null) {
            node.next = prevNode;
            newHead = node;
        } else {
            reverseListRecursion(node.next, node);
            node.next = prevNode;
        }
    }



    public ListNode reverseListIterate(ListNode head) {
        if (head == null || head.next == null) return head;

        ListNode prevNode = null;
        ListNode currentNode = head;
        ListNode nextNode = head.next;

        while (true) {
            nextNode = currentNode.next;
            currentNode.next = prevNode;

            if ( nextNode == null)
                break;

            prevNode = currentNode;
            currentNode = nextNode;

        }


        return currentNode;
    }
}
