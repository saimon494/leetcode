package com.leet.tree;

public class MaximumDepth {
    /**
     * 104. Maximum Depth of Binary Tree
     * Given the root of a binary tree, return its maximum depth.
     * A binary tree's maximum depth is the number of nodes along the longest path from the root node down to the farthest leaf node.
     */
    public static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public int maxDepth(TreeNode root) {
        // Base Condition
        if(root == null) return 0;
        // Hypothesis
        int left = maxDepth(root.left);
        int right = maxDepth(root.right);
        // Induction
        return Math.max(left, right) + 1;
    }

    public static void main(String[] args) {
        // root = [3,9,20,null,null,15,7]
        var maximumDepth = new MaximumDepth();
        var root = new MaximumDepth.TreeNode(3,
                new MaximumDepth.TreeNode(9, null, null),
                new MaximumDepth.TreeNode(20, new MaximumDepth.TreeNode(15), new MaximumDepth.TreeNode(7)));
        System.out.println(maximumDepth.maxDepth(root));
    }
}
