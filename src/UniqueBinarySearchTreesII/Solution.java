package UniqueBinarySearchTreesII;

import Common.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    private List<TreeNode>[][] dp;
    public List<TreeNode> generateTrees(int n) {
        dp=new List[n+1][n+1];
        return generateTrees(1, n);
    }

    private List<TreeNode> generateTrees(int i, int j) {
        List<TreeNode> answer = new ArrayList<>();
        if (i > j) {
            answer.add(null);
            return answer;
        }

        if (dp[i][j]!=null)
            return dp[i][j];

        for (int k = i; k <= j; k++) {
            List<TreeNode> left = generateTrees(i, k - 1);
            List<TreeNode> right = generateTrees(k + 1, j);

            for (var l : left) {
                for (var r : right) {
                    TreeNode root = new TreeNode(k);
                    root.left = l;
                    root.right = r;

                    answer.add(root);
                }
            }
        }
        dp[i][j]=answer;
        return answer;
    }


}
