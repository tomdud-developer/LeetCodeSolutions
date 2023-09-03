package org.leetcode.solutions.P102_Binary_Tree_Level_Order_Traversal;

import java.util.ArrayList;
import java.util.List;

public class Solution {

    List<List<Integer>> list = new ArrayList<>();

    public List<List<Integer>> levelOrder(TreeNode root) {
        if (root == null) return list;

        list.add(List.of(root.val));

        if (root.left != null)
            bst(root.left, 1);

        if (root.right != null)
            bst(root.right, 1);

        return list;
    }

    public void bst(TreeNode node, int level) {
        if (list.size() <= level)
            list.add(new ArrayList<>());

        list.get(level).add(node.val);

        if (node.left != null)
            bst(node.left, level + 1);

        if (node.right != null)
            bst(node.right, level + 1);
    }

}
