package BalancedBinaryTree;

public class Solution {
    private boolean balanced;

    public boolean isBalanced(TreeNode root) {
        balanced = true;
        checkHeights(root);

        return balanced;

    }

    private int checkHeights(TreeNode node) {
        if (node == null || !balanced)
            return 0;

        var leftHeight = checkHeights(node.left);
        var rightHeight = checkHeights(node.right);

        if (Math.abs(leftHeight-rightHeight)>1) {
            balanced = false;
        }

        return 1 + Math.max(leftHeight, rightHeight);

    }
}

class TreeNode {
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
