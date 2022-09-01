package MaximumDepthofBinaryTree;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

public class Solution {
    public int maxDepth(TreeNode root) {
        if (root == null)
            return 0;

        return Math.max(maxDepth(root.left), maxDepth(root.right)) + 1;

    }

    public int maxDepthNR(TreeNode root) {
        if (root == null) return 0;
        Deque<TreeNode> deque = new LinkedList<>();
        deque.offer(root);
        var level = 1;

        while (!deque.isEmpty()) {
            for (var i = 0; i < deque.size(); ++i) {
                TreeNode node = deque.poll();
                if (node.left != null)
                    deque.offer(node.left);
                if (node.right != null)
                    deque.offer(node.left);
            }
            ++level;
        }
        return level;


    }

    public int maxDepthDFSIter(TreeNode root) {

        Stack<TreeNode> nodeStack = new Stack<>();
        Stack<Integer> levelStack = new Stack<>();

        nodeStack.add(root);
        levelStack.add(1);

        var maxLevel = 0;

        while (!nodeStack.isEmpty()) {
            TreeNode node = nodeStack.pop();
            int level = levelStack.pop();

            if (node != null) {
                maxLevel = Math.max(maxLevel, level);

                nodeStack.add(node.left);
                levelStack.add(level + 1);
                nodeStack.add(node.right);
                levelStack.add(level + 1);
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

