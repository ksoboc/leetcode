package MaximumLevelSumofaBinaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class Solution {
    public int maxLevelSum(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        int maxSum = Integer.MIN_VALUE;
        int level = 0;
        int maxLevel = 0;
        queue.offer(root);

        while (!queue.isEmpty()) {
            int qsize = queue.size();
            int sum = 0;
            for (int i = 0; i < qsize; i++) {
                TreeNode node = queue.poll();
                sum += node.val;
                if (node.left != null)
                    queue.offer(node.left);
                if (node.right != null)
                    queue.offer(node.right);
            }
            ++level;
            if (sum > maxSum) {
                maxLevel = level;
                maxSum = sum;
            }
        }
        return maxLevel;
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


