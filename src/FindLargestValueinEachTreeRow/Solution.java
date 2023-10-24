package FindLargestValueinEachTreeRow;

import Common.TreeNode;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> largestValues(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        dfs(root,0,res);
        return res;
    }

    private void dfs(TreeNode root, int level, List<Integer> list) {
        if (root==null)
            return;
        if (list.size()<=level)
            list.add(root.val);
        else if (root.val>list.get(level)) {
            list.set(level, root.val);
        }
        dfs(root.left,level+1,list);
        dfs(root.right,level+1,list);
    }
}
