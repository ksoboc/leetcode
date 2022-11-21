package SymmetricTree;

import java.util.*;

public class Solution {
    public boolean isSymmetric(TreeNode root) {
        var r=root.right;
        var l=root.left;
        
        if (r==null&&l==null)
            return true;
        
        if (r==null||l==null)
            return false;
        
        return isSymmetric(l,r);

    }

    private boolean isSymmetric(TreeNode p, TreeNode q) {
        if (p==null&&q==null)
            return true;
        if (p==null||q==null)
            return false;

        if (p.val!=q.val) return false;

        return isSymmetric(p.left,q.right) && isSymmetric(p.right,q.left);
    }

    public boolean isSymmetricBfs(TreeNode root) {
        Deque<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            int size = queue.size();
            Integer[] list = new Integer[size];
            int cnt=0;
            while (cnt < size) {
                var node = queue.poll();
                if (node==null) {
                    list[cnt++]=null;
                    continue;
                }
                list[cnt++] = node.val;

                queue.offer(node.left);
                queue.offer(node.right);
            }
            for (int i = 0; i < size/2; i++) {
                if (!Objects.equals(list[i], list[size - i - 1]))
                    return false;
            }
        }
        return true;

    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
