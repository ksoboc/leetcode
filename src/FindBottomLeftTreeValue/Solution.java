package FindBottomLeftTreeValue;

import java.util.ArrayDeque;
import java.util.Deque;

public class Solution {
    public int findBottomLeftValue(TreeNode root) {
        Deque<TreeNode> deque = new ArrayDeque<>();
        deque.offer(root);
        TreeNode node = null;

        while (!deque.isEmpty()) {
            var len = deque.size();
            for (int i = 0; i < len; i++) {
                node = deque.poll();

                if (node.right != null)
                    deque.offer(node.right);
                if (node.left != null)
                    deque.offer(node.left);

            }
        }
        return node.val;

    }

    int res = 0;
    int maxDepth = 0;
    public int findBottomLeftValueDFS(TreeNode root) {
        dfs(root, 1);
        return res;
    }

    private void dfs(TreeNode root, int depth) {
        if (root==null) return;
        if (depth>maxDepth) {
            maxDepth=depth;
            res=root.val;
        }
        dfs(root.left,depth+1);
        dfs(root.right,depth+1);

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