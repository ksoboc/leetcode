package KthSmallestElementinBST;

import java.util.Stack;

public class Solution {
    public int kthSmallest(TreeNode root, int k) {
        Stack<TreeNode> stack = new Stack<>();

        var n = 0;
        var cur = root;

        while (n!=k) {
            while (cur!=null) {
                stack.add(cur);
                cur=cur.left;
            }
            cur = stack.pop();
            n+=1;
            if (n==k)
                return cur.val;
            stack.add(cur);
            cur = cur.right;
        }

        return -1;

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

