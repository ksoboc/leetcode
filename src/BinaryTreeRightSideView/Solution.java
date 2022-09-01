package BinaryTreeRightSideView;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class Solution {
    public List<Integer> rightSideViewDFS(TreeNode root) {
        List<Integer> list = new ArrayList<>();

        rightSideViewDFS(root, list, 0);

        return list;
    }

    private void rightSideViewDFS(TreeNode root, List<Integer> list, int level) {
        if (root==null)
            return;

        if (level==list.size())
            list.add(root.val);

        rightSideViewDFS(root.right,list,level+1);
        rightSideViewDFS(root.left,list,level+1);

    }

    public List<Integer> rightSideViewBFS(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        Deque<TreeNode> deque = new ArrayDeque<>();

        if (root==null)
            return list;

        deque.add(root);
        var rightmost = 0;
        while (!deque.isEmpty()) {
            var len = deque.size();
            for (int i = 0; i < len; i++) {
                var node = deque.poll();
                if (node!=null) {
                    rightmost = node.val;
                    if (node.left!=null)
                        deque.offer(node.left);
                    if (node.right!=null)
                        deque.offer(node.right);
                }

            }
            list.add(rightmost);
        }


        return list;
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
