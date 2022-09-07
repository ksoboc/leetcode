package ConstructStringfromBinaryTree;

public class Solution {
    public String tree2str(TreeNode root) {
        if (root == null)
            return "";
        StringBuilder sb = new StringBuilder().append(root.val);
        if (root.left != null || root.right != null)
            sb.append("(").append(tree2str(root.left)).append(")");
        if (root.right != null)
            sb.append("(").append(tree2str(root.right)).append(")");

        return sb.toString();

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
