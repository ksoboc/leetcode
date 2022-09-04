package VerticalOrderTraversalofaBinaryTree;

import java.util.*;

public class Solution {
    private Map<Integer, Map<Integer,List<Integer>>> columns = new TreeMap<>();
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        dfs(root,0,0);

        List<List<Integer>> res = new ArrayList<>();
        for (var colKey:columns.keySet()) {
            var rows = columns.get(colKey);
            List<Integer> list = new ArrayList<>();
            for (var rowKey:rows.keySet()) {
                var rowValues = rows.get(rowKey);
                Collections.sort(rowValues);
                list.addAll(rowValues);
            }
            res.add(list);
        }
        return res;
    }

    private void dfs(TreeNode node, int c, int r) {
        if (node==null)
            return;

        if (!columns.containsKey(c)) {
            columns.put(c, new TreeMap<>());
        }

        if (!columns.get(c).containsKey(r)) {
            columns.get(c).put(r, new ArrayList<>());
        }

        columns.get(c).get(r).add(node.val);

        dfs(node.left,c-1,r+1);
        dfs(node.right,c+1,r+1);
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
