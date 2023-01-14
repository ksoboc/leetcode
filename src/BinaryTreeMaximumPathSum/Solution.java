package BinaryTreeMaximumPathSum;

public class Solution {
    private int maxSoFar =Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        dfs(root);
        return maxSoFar;
    }

    private int dfs(TreeNode root) {
        if (root==null)
            return 0;

        var leftMax = Math.max(dfs(root.left),0);
        var rightMax = Math.max(dfs(root.right),0);

        maxSoFar = Math.max(maxSoFar,root.val+leftMax+rightMax);

        return root.val + Math.max(leftMax,rightMax);
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