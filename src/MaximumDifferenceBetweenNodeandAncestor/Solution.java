package MaximumDifferenceBetweenNodeandAncestor;

import Common.TreeNode;

public class Solution {
    public int maxAncestorDiff(TreeNode root) {
        if (root == null)
            return -1;
        return dfs(root, root.val, root.val);
    }

    private int dfs(TreeNode node, int min, int max) {
        if (node == null)
            return -1;

        int val1 = Math.max(Math.abs(min - node.val), Math.abs(max - node.val));
        min = Math.min(min, node.val);
        max = Math.max(max, node.val);
        int val2 = Math.max(dfs(node.left, min, max), dfs(node.right, min, max));

        return Math.max(val1, val2);
    }
}
