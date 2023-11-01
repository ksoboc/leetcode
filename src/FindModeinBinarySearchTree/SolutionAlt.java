package FindModeinBinarySearchTree;

import Common.TreeNode;

import java.util.*;

public class SolutionAlt {
    private Set<Integer> modes;
    private int maxCount;
    private int count;
    private int prev;

    public int[] findMode(TreeNode root) {
        modes =new HashSet<>();

        maxCount=0;
        count=0;
        prev=-1;
        inorder(root);


        int[] res = new int[modes.size()];
        int i=0;
        for (var num:modes)
            res[i++]=num;
        return res;
    }



    private void inorder(TreeNode root) {
        if (root==null)
            return ;



        inorder(root.left);

        if (root.val==prev) {
            count += 1;
        } else {
            count=1;
            prev= root.val;
        }


        if (count>maxCount) {
            maxCount=count;
            modes.clear();
            modes.add(root.val);
        } else if (count==maxCount) {
            modes.add(root.val);
        }
        inorder(root.right);


    }


}
