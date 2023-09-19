package com.leet.tree;

public class SymmetricTree {
    /**
     * 101. Symmetric Tree
     * Given the root of a binary tree, check whether it is a mirror of itself (i.e., symmetric around its center).
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
    public boolean isSymmetric(TreeNode root) {
        return isSame(root.left, root.right);
    }

    private boolean isSame(TreeNode root1, TreeNode root2){
        if (root1 == null && root2 == null) return true;
        if ((root1 == null || root2 == null)) return false;
        return (root1.val == root2.val) && isSame(root1.left, root2.right) && isSame(root1.right, root2.left);
    }
    public static void main(String[] args) {
        // root = [1,2,2,3,4,4,3]
        var symmetricTree = new SymmetricTree();
        var root = new SymmetricTree.TreeNode(1,
                new SymmetricTree.TreeNode(2, new SymmetricTree.TreeNode(3), new SymmetricTree.TreeNode(4)),
                new SymmetricTree.TreeNode(2, new SymmetricTree.TreeNode(4), new SymmetricTree.TreeNode(3)));
        System.out.println(symmetricTree.isSymmetric(root));
    }


}
