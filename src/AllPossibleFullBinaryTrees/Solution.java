package AllPossibleFullBinaryTrees;


import java.util.*;

public class Solution {
    private List<TreeNode>[] memo;

    public List<TreeNode> allPossibleFBT(int n) {
        memo = new List[n+1];
        return helper(n);
    }

    public List<TreeNode> helper(int n) {


        if (n==1) {
            return List.of(new TreeNode(0));
        }

        if (memo[n]!=null) {
            return memo[n];
        }

        List<TreeNode> list=new ArrayList<>();
        for (int i = 1; i < n-1; i+=2) {

            List<TreeNode> left = helper(i);
            List<TreeNode> right = helper(n-1-i);

            for (var t1:left) {
                for (var t2:right) {
                    TreeNode root = new TreeNode(0);
                    root.left=t1;
                    root.right=t2;
                    list.add(root);
                }

            }

        }
        memo[n]=list;
        return list;
    }




}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}


