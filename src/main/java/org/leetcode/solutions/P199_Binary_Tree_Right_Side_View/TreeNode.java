package org.leetcode.solutions.P199_Binary_Tree_Right_Side_View;

public class TreeNode {
     public int val;
     TreeNode left;
     TreeNode right;

     TreeNode() {}

     TreeNode(int val) {
         this.val = val;
     }

     TreeNode(int val, TreeNode left, TreeNode right) {
         this.val = val;
         this.left = left;
         this.right = right;
     }

}
