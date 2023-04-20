package MaximumWidthofBinaryTree;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    private List<Long> lvlMin = new ArrayList<>();
    private List<Long> lvlMax = new ArrayList<>();

    public int widthOfBinaryTree(TreeNode root) {
        dfs(root, 0, 0);
        long max = 0;
        for (int i = 0; i < lvlMax.size(); i++) {
            max = Math.max(max, lvlMax.get(i) - lvlMin.get(i) + 1);
        }
        return (int)max;
    }

    private void dfs(TreeNode node, int level, long pos) {
        if (node == null)
            return;
        if (level >= lvlMin.size())
            lvlMin.add(pos);
        else if (pos < lvlMin.get(level))
            lvlMin.set(level, pos);
        if (level >= lvlMax.size())
            lvlMax.add(pos);
        else if (pos > lvlMax.get(level))
            lvlMax.set(level, pos);

        dfs(node.left, level + 1, 2 * pos);
        dfs(node.right, level + 1, 2 * pos + 1);
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


