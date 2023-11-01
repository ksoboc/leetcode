package FindModeinBinarySearchTree;

import Common.TreeNode;

import java.util.*;

public class Solution {
    private Set<Integer> modes;
    private Map<Integer,Integer> valuesToCounts;
    private int maxCount;

    public int[] findMode(TreeNode root) {
        modes =new HashSet<>();
        valuesToCounts=new HashMap<>();

        maxCount=1;
        helper(root);


        int[] res = new int[modes.size()];
        int i=0;
        for (var num:modes)
            res[i++]=num;
        return res;
    }

    private void helper(TreeNode node) {
        if (node==null)
            return;

        valuesToCounts.put(node.val, valuesToCounts.getOrDefault(node.val,0)+1);
        if (valuesToCounts.get(node.val)>maxCount) {
            maxCount=valuesToCounts.get(node.val);
            modes.clear();
            modes.add(node.val);
        } else if (valuesToCounts.get(node.val)==maxCount) {
            modes.add(node.val);
        }
        helper(node.left);
        helper(node.right);
    }

}
