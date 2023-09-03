package org.leetcode.solutions.P199_Binary_Tree_Right_Side_View;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class Solution {

    List<Integer> list = new ArrayList<>();

    public List<Integer> rightSideView(TreeNode root) {
        if (root == null) return list;

        list.add(root.val);

        if (root.right != null)
            bst(root.right, 1);
        if (root.left != null)
            bst(root.left, 1);

        return list;
    }

    void bst(TreeNode node, int level) {
        if (list.size() <= level)
            list.add(node.val);

        if (node.right != null)
            bst(node.right, level + 1);
        if (node.left != null)
            bst(node.left, level + 1);
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        TreeNode root = new TreeNode(1, null, new TreeNode(2, null, new TreeNode(3, null, new TreeNode(4, null, null))));
        System.out.println(solution.rightSideView(root));
    }

}
