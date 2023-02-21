package pseudoPalindromicPathsInaBinaryTree;

public class Solution {
    public int pseudoPalindromicPaths(TreeNode root) {
        return pseudoPalindromicPaths(root, 0);
    }

    private int pseudoPalindromicPaths(TreeNode node, int flag) {
        if (node == null)
            return 0;
        flag ^= 1 << node.val;
        if (node.left == null && node.right == null) {
            return (flag & (flag - 1)) == 0 ? 1 : 0;
        }
        return pseudoPalindromicPaths(node.left, flag) + pseudoPalindromicPaths(node.right, flag);
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

