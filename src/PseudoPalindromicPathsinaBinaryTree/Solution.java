package PseudoPalindromicPathsinaBinaryTree;

import Common.TreeNode;

public class Solution {
    private int res;
    public int pseudoPalindromicPaths(TreeNode root) {
        res=0;
        pseudoPalindromicPaths(root, 0);
        return res;
    }

    private void pseudoPalindromicPaths(TreeNode node, int flag) {
        if (node == null)
            return ;
        flag ^= 1 << node.val;
        if (node.left == null && node.right == null) {
            res+= (flag & (flag - 1)) == 0 ? 1 : 0;
        }
        pseudoPalindromicPaths(node.left, flag);
        pseudoPalindromicPaths(node.right, flag);
    }
}

