package AddOneRowtoTree;

import Common.TreeNode;

public class Solution {
    public TreeNode addOneRow(TreeNode root, int val, int depth) {
        TreeNode dummy = new TreeNode();
        dummy.left=root;
        addOneRow(root,val,depth,1,true, dummy);
        return dummy.left;
    }

    private void addOneRow(TreeNode node, int val, int depth, int curDepth, boolean left, TreeNode parent) {

        if (curDepth==depth) {
            TreeNode newNode = new TreeNode(val);
            if (left) {
                newNode.left = node;
                parent.left=newNode;
            } else {
                newNode.right = node;
                parent.right=newNode;
            }
        } else if (node!=null) {
            addOneRow(node.left,val,depth,curDepth+1,true, node);
            addOneRow(node.right,val,depth,curDepth+1,false, node);
        }
    }
}
