package DeleteNodesAndReturnForest;

import Common.TreeNode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution {
    public List<TreeNode> delNodes(TreeNode root, int[] to_delete) {
        List<TreeNode> forest = new ArrayList<>();
        Set<Integer> valToDelete = new HashSet<>();

        for (var val :
                to_delete) {
            valToDelete.add(val);
        }

        TreeNode node = delNodes(root,forest,valToDelete);
        if (node!=null)
            forest.add(node);

        return forest;
    }

    private TreeNode delNodes(TreeNode node, List<TreeNode> forest, Set<Integer> valToDelete) {
        if (node==null)
            return null;
        node.left=delNodes(node.left,forest,valToDelete);
        node.right=delNodes(node.right,forest,valToDelete);
        if (valToDelete.contains(node.val)) {
            if (node.left!=null)
                forest.add(node.left);
            if (node.right!=null)
                forest.add(node.right);
            return null;
        }
        return node;
    }
}
