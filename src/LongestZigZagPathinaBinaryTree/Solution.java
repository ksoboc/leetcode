package LongestZigZagPathinaBinaryTree;

public class Solution {
    private int maxLen;

    public int longestZigZag(TreeNode root) {
        maxLen = 0;
        maxZigZag(root, false, 0);
        maxZigZag(root, true, 0);
        return maxLen;
    }

    private void maxZigZag(TreeNode node, boolean goRight, int steps) {
        if (node == null)
            return;

        if (steps > maxLen)
            maxLen = steps;
        if (!goRight) {
            maxZigZag(node.left, true, steps + 1);
            maxZigZag(node.right, false, 1);
        } else {
            maxZigZag(node.right, false, steps + 1);
            maxZigZag(node.left, true, 1);
        }
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


