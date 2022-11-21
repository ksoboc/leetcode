package TwoSumIVInputisaBST;

import Common.TreeNode;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    private Set<Integer> values = new HashSet<>();
    public boolean findTarget(TreeNode root, int k) {
        if (root==null)
            return false;
        int pair = k - root.val;
        if (values.contains(pair))
            return true;

        values.add(root.val);
        return findTarget(root.left,k) || findTarget(root.right,k);
    }
}
