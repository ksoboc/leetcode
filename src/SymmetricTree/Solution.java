package SymmetricTree;

public class Solution {
    public boolean isSymmetric(TreeNode root) {
        var r=root.right;
        var l=root.left;
        
        if (r==null&&l==null)
            return true;
        
        if (r==null||l==null)
            return false;
        
        return isSymmetric(l,r) && isSymmetric(r,l);

    }

    private boolean isSymmetric(TreeNode p, TreeNode q) {
        if (p==null&&q==null)
            return true;
        if (p==null||q==null)
            return false;

        if (p.val!=q.val) return false;

        return isSymmetric(p.left,q.right) && isSymmetric(p.right,q.left);
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
