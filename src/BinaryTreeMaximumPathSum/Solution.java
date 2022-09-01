package BinaryTreeMaximumPathSum;

public class Solution {
    private int res=Integer.MIN_VALUE;
    public int maxPathSum(TreeNode root) {
        dfs(root);
        return res;
    }

    private int dfs(TreeNode root) {
        if (root==null)
            return 0;

        var leftMax = Math.max(dfs(root.left),0);
        var rightMax = Math.max(dfs(root.right),0);

        res = Math.max(res,root.val+leftMax+rightMax);

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