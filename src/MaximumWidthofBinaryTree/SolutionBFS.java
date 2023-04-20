package MaximumWidthofBinaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class SolutionBFS {
    private static class NodePos {
        TreeNode node;
        long pos;

        public NodePos(TreeNode node, long pos) {
            this.node = node;
            this.pos = pos;
        }
    }
    public int widthOfBinaryTree(TreeNode root) {
        Queue<NodePos> queue=new LinkedList<>();
        queue.add(new NodePos(root,0));
        long maxW = 0;
        while (!queue.isEmpty()) {
            int lvlSize = queue.size();
            long min=Long.MAX_VALUE;
            long max=Long.MIN_VALUE;
            for (int i = 0; i < lvlSize; i++) {
                NodePos nodePos=queue.poll();
                TreeNode node = nodePos.node;
                long pos = nodePos.pos;
                min=Math.min(min,pos);
                max=Math.max(max,pos);
                if (node.left!=null)
                    queue.offer(new NodePos(node.left, 2*pos));
                if (node.right!=null)
                    queue.offer(new NodePos(node.right, 2*pos+1));
            }
            if (max-min+1>maxW)
                maxW=max-min+1;
        }
        return (int)maxW;
    }
}

