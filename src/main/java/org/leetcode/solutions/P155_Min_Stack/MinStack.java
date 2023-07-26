package org.leetcode.solutions.P155_Min_Stack;

import java.util.Arrays;
import java.util.Stack;

public class MinStack {

    private int[] array;
    private int topIndex;
    Stack<Integer> minIndexesStack = new Stack<>();

    public MinStack() {
        array = new int[16];
        topIndex = -1;
    }

    public void push(int val) {
        topIndex++;
        if(topIndex == array.length)
            array = grow(array);
        array[topIndex] = val;
        if(topIndex == 0 || val <= array[minIndexesStack.peek()])
            minIndexesStack.push(topIndex);
    }

    private int[] grow(int[] array) {
        int oldCapacity = array.length;
        int newCapacity = oldCapacity * 2;
        return Arrays.copyOf(array, newCapacity);
    }

    public void pop() {
        if(array[topIndex] == array[minIndexesStack.peek()])
            minIndexesStack.pop();
        topIndex--;
    }

    public int top() {
        return array[topIndex];
    }

    public int getMin() {
        return array[minIndexesStack.peek()];
    }

}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
