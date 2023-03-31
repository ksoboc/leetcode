package BinaryTreeZigzagLevelOrderTraversal;

import Common.TreeNode;

import java.util.*;

public class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();

        if (root == null)
            return ans;
        Queue<TreeNode> queue = new LinkedList<>();

        queue.offer(root);
        boolean leftToRight = true;
        while (!queue.isEmpty()) {
            int size = queue.size();
            List<Integer> level = new ArrayList<>();
            while (size-- > 0) {
                TreeNode node = queue.poll();
                if (node == null)
                    continue;
                level.add(node.val);

                if (node.left != null)
                    queue.offer(node.left);
                if (node.right != null)
                    queue.offer(node.right);

            }
            if (!leftToRight)
                Collections.reverse(level);
            leftToRight = !leftToRight;

            ans.add(level);
        }
        return ans;
    }
}
