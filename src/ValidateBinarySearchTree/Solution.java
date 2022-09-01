package ValidateBinarySearchTree;

import java.util.Stack;

public class Solution {
    public boolean isValidBST(TreeNode root) {
        return validate(root, Long.MIN_VALUE, Long.MAX_VALUE);

    }

    public boolean isValidBSTnr(TreeNode root) {
        Stack<TreeNode> stack = new Stack<>();
        Stack<int[]> limits = new Stack<>();

        stack.push(root);
        limits.push(new int[]{Integer.MIN_VALUE,Integer.MAX_VALUE});
        while (!stack.isEmpty()) {
            var node = stack.pop();
            var limit = limits.pop();
            var minValue=limit[0];
            var maxValue=limit[1];
            if (node.val <= minValue || node.val >= maxValue)
                return false;
            if (node.left!=null) {
                stack.push(node.left);
                limits.push(new int[]{minValue, node.val});
            }
            if (node.right!=null) {
                stack.push(node.right);
                limits.push(new int[]{ node.val, maxValue});
            }
        }
        return true;
    }

    private boolean validate(TreeNode node, long minValue, long maxValue) {
        if (node == null)
            return true;
        if (node.val <= minValue || node.val >= maxValue)
            return false;

        return validate(node.left, minValue, node.val) && validate(node.right, node.val, maxValue);
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

