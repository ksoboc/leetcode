package KthSmallestElementinaBST;

import Common.TreeNode;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Stack;

public class Solution {
    public int kthSmallest(TreeNode root, int k) {
        Deque<TreeNode> stack=new ArrayDeque<>();
        while (true) {
            while (root!=null) {
                stack.push(root);
                root=root.left;
            }
            root = stack.pop();
            if (--k==0)
                return root.val;
            root=root.right;
        }

    }
    private int kthsmallestVal;
    private int count;

    public int kthSmallestRec(TreeNode root, int k) {
        inorder(root, k);
        return kthsmallestVal;
    }

    private void inorder(TreeNode node, int k) {
        if (node == null)
            return ;
        inorder(node.left,k);
        if (++count==k) {
            kthsmallestVal=node.val;
            ++count;
            return;
        }
        inorder(node.right,k);
    }
}
