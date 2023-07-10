package MinimumDepthofBinaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class SolutionBFS {
    public int minDepth(TreeNode root) {
        if (root == null)
            return 0;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        int minDepth = 0;
        while (!queue.isEmpty()) {
            int qsize = queue.size();
            ++minDepth;
            for (int i = 0; i < qsize; i++) {
                TreeNode node = queue.poll();
                TreeNode right = node.right;
                TreeNode left = node.left;
                if (left == null && right == null)
                    return minDepth;
                if (left != null)
                    queue.offer(left);
                if (right != null)
                    queue.offer(right);
            }
        }
        return 0;
    }

}
