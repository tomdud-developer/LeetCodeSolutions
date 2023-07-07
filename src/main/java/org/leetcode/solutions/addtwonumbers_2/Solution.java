package org.leetcode.solutions.addtwonumbers_2;


import java.math.BigInteger;

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        StringBuilder stringBuilder1 = new StringBuilder();
        stringBuilder1.append(l1.val);
        while(l1.next != null) {
            l1 = l1.next;
            stringBuilder1.append(l1.val);
        }

        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append(l2.val);
        while(l2.next != null) {
            l2 = l2.next;
            stringBuilder2.append(l2.val);
        }

        stringBuilder1.reverse();
        stringBuilder2.reverse();

        BigInteger number1 = new BigInteger(stringBuilder1.toString());
        BigInteger number2 = new BigInteger(stringBuilder2.toString());
        String[] resultString = number1.add(number2).toString().split("");
        ListNode resultNode = null;
        for(int i = 0; i < resultString.length; i++) {
            resultNode = new ListNode(Integer.parseInt(resultString[i]), resultNode);
        }

        return resultNode;
    }
}