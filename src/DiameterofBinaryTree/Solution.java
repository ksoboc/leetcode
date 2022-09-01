package DiameterofBinaryTree;

public class Solution {
    private int maxDiameter = 0;
    public int diameterOfBinaryTree(TreeNode root) {
        if (root==null)
            return 0;

        dfs(root);
        return maxDiameter;
    }

    private int dfs(TreeNode root) {
        if (root==null)
            return -1;

        var leftHeight = dfs(root.left);
        var rightHeight = dfs(root.right);
        var diameter = 2 + leftHeight + rightHeight;
        maxDiameter = Math.max(maxDiameter,diameter);

        return 1 + Math.max(leftHeight,rightHeight);

    }
}


class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
