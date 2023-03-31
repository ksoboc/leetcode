package ConstructBinaryTreefromInorderandPostorderTraversal;

import Common.TreeNode;
import Common.TreeUtil;

import java.util.ArrayDeque;
import java.util.Deque;

public class SolutionIter {
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        TreeNode ret = new TreeNode(), p = ret;
        Deque<TreeNode> stk = new ArrayDeque<>();
        int i = inorder.length-1, j = postorder.length-1;
        while (j >= 0) {
            p.left = new TreeNode(postorder[j]);
            p = p.left;
            stk.push(p);
            TreeUtil.printTree(ret);
            while (postorder[j] != inorder[i]) {
                p.right = new TreeNode(postorder[--j]);
                p = p.right;
                TreeUtil.printTree(ret);
                stk.push(p);
            }
            System.out.println("----");
            j--;
            while (!stk.isEmpty() && stk.peek().val == inorder[i]) {
                i--;
                p = stk.pop();
            }
        }
        return ret.left;
    }
}
