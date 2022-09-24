package PathSumII;

import Common.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    private List<List<Integer>> answer = new ArrayList<>();

    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        dfs(root, targetSum, 0, new ArrayList<>());
        return answer;
    }

    private void dfs(TreeNode node, int targetSum, int sumSoFar, ArrayList<Integer> pathList) {
        if (node==null)
            return;

        if (node.left==null && node.right==null) {
            if (sumSoFar+node.val==targetSum) {

                pathList.add(node.val);
                answer.add(new ArrayList<>(pathList));
                pathList.remove(pathList.size()-1);
                return;
            }

        }

        pathList.add(node.val);
        dfs(node.left,targetSum,sumSoFar+ node.val, pathList);
        dfs(node.right,targetSum,sumSoFar+ node.val, pathList);
        pathList.remove(pathList.size()-1);

    }
}
