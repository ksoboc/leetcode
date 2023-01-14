package MaximumProductofSplittedBinaryTree;

import Common.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public int maxProduct(TreeNode root) {
        List<Integer> sums = new ArrayList<>();
        int total = dfs(root,sums);
        long maxProd = 0;
        for (var sum:sums) {
            maxProd = Math.max(maxProd, (total-sum)*sum);
        }
        return (int)(maxProd%1_000_000_007);
    }

    private int dfs(TreeNode root, List<Integer> sums) {
        if (root==null)
            return 0;
        int sum = dfs(root.left,sums) + dfs(root.right,sums) + root.val;
        sums.add(sum);
        return sum;
    }
}
