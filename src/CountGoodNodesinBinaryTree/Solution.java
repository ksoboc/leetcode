package CountGoodNodesinBinaryTree;

public class Solution {
    public int goodNodes(TreeNode root) {
        return goodNodes(root, root.val);
    }

    private int goodNodes(TreeNode node, int maxVal) {
        if (node == null)
            return 0;

        int res = node.val >= maxVal ? 1 : 0;
        maxVal = Math.max(maxVal, node.val);

        return res + goodNodes(node.left, maxVal) + goodNodes(node.right, maxVal);
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
