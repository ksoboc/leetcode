package FindModeinBinarySearchTree;

import Common.TreeNode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SolutionMorris {


    public int[] findMode(TreeNode root) {
        int maxStreak = 0;
        int currStreak = 0;
        int currNum = 0;
        List<Integer> ans = new ArrayList();

        TreeNode curr=root;
        while (curr!=null) {
            if (curr.left!=null) {
                TreeNode friend = curr.left;
                while (friend.right!=null) {
                    friend=friend.right;
                }
                friend.right=curr;
                TreeNode left=curr.left;
                curr.left=null;
                curr=left;
            } else {
                int num = curr.val;
                if (num==currNum) {
                    ++currStreak;
                } else {
                    currNum=num;
                    currStreak=1;
                }

                if (currStreak>maxStreak) {
                    ans=new ArrayList<>();
                    ans.add(num);
                    maxStreak=currStreak;
                } else if (currStreak==maxStreak) {
                    ans.add(num);
                }
                curr=curr.right;
            }


        }


        int[] res = new int[ans.size()];
        int i=0;
        for (var num:ans)
            res[i++]=num;
        return res;
    }






}
