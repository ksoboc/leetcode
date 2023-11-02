package CountNodesEqualtoAverageofSubtree;

public class Solution {
    private int avgCount;

    public int averageOfSubtree(TreeNode root) {
        avgCount = 0;
        dfs(root);
        return avgCount;
    }

    private int[] dfs(TreeNode root) {
        if (root == null)
            return new int[]{0, 0};
        var left = dfs(root.left);
        var right = dfs(root.right);
        int sum = left[0] + right[0] + root.val;
        int count = left[1] + right[1] + 1;

        if (root.val == sum / count)
            ++avgCount;
        return new int[]{sum, count};
    }
}
