package FlattenBinaryTreetoLinkedList;

import java.util.Optional;

public class Solution {
    public void flatten(TreeNode root) {
        dfs(root);

    }

    private TreeNode dfs(TreeNode root) {
        if (root == null)
            return null;

        var leftNode = dfs(root.left);
        var rightNode = dfs(root.right);

        if (leftNode != null) {
            leftNode.right = root.right;
            root.right = root.left;
            root.left = null;
        }

        return Optional.ofNullable(rightNode).orElseGet(() -> Optional.ofNullable(leftNode).orElse(root));
//        if (rightNode!=null) return rightNode;
//        if (leftNode!=null) return leftNode;
//        return root;
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