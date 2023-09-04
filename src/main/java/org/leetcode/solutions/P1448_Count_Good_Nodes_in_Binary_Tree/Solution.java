package org.leetcode.solutions.P1448_Count_Good_Nodes_in_Binary_Tree;

public class Solution {

    int goodNodesCounter = 0;

    public int goodNodes(TreeNode root) {
        if (root != null) {
            goodNodesCounter++;
        } else {
            return 0;
        }

        if (root.left != null)
            bst(root.left, root.val);
        if (root.right != null)
            bst(root.right, root.val);

        return goodNodesCounter;
    }

    private void bst(TreeNode node, int maxInPath) {
        if (node.val >= maxInPath) {
            goodNodesCounter++;
            maxInPath = node.val;
        }

        if (node.left != null)
            bst(node.left, maxInPath);
        if (node.right != null)
            bst(node.right, maxInPath);
    }
}
