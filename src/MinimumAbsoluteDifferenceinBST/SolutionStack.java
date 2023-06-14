package MinimumAbsoluteDifferenceinBST;

import java.util.Stack;

public class SolutionStack {



    public int getMinimumDifference(TreeNode root) {
        TreeNode prev=null;
        int minDiff = Integer.MAX_VALUE;
        Stack<TreeNode> stack=new Stack<>();

        TreeNode curr = root;

        while (curr != null || !stack.isEmpty()) {
            while (curr != null) {
                stack.push(curr);
                curr = curr.left;
            }

            curr = stack.pop();

            if (prev != null) {
                minDiff = Math.min(minDiff, curr.val - prev.val);
            }

            prev = curr;
            curr = curr.right;
        }
        return minDiff;
    }

}

