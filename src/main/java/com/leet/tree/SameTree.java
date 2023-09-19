package com.leet.tree;

public class SameTree {
    /**
     * 100. Same Tree
     * Given the roots of two binary trees p and q, write a function to check if they are the same or not.
     * Two binary trees are considered the same if they are structurally identical, and the nodes have the same value.
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
    public boolean isSameTree(TreeNode p, TreeNode q) {
        // Base case: if both trees are null, they are identical
        if (p == null && q == null) {
            return true;
        }
        // If only one tree is null or the values are different, they are not identical
        if (p == null || q == null || p.val != q.val) {
            return false;
        }
        // Recursively check if the left and right subtrees are identical
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
    public static void main(String[] args) {
        // p = [1,2,3], q = [1,2,3]
        var sameTree = new SameTree();
//        var p = new TreeNode(1, new TreeNode(2), new TreeNode(3));
//        var q = new TreeNode(1, new TreeNode(2), new TreeNode(3));
        // p = [1,2], q = [1,null,2]
        var p = new TreeNode(1, new TreeNode(2), null);
        var q = new TreeNode(1, null, new TreeNode(2));
        System.out.println(sameTree.isSameTree(p, q));
    }

}
