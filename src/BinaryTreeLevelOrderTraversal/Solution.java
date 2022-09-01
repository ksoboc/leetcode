package BinaryTreeLevelOrderTraversal;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

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

public class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {

        List<List<Integer>> result = new ArrayList<>();
        Deque<TreeNode> deque = new ArrayDeque<>();

        if (root!=null)
            deque.add(root);
        while (!deque.isEmpty()) {
            var levelLen = deque.size();
            List<Integer> level = new ArrayList<>();
            for (var i = 0; i < levelLen; ++i) {
                TreeNode node = deque.poll();

                level.add(node.val);
                if (node.left != null)
                    deque.addLast(node.left);
                if (node.right != null)
                    deque.addLast(node.right);

            }
            if (!level.isEmpty())
                result.add(level);
        }
        return result;
    }
}
