package BinaryTreePreorderTraversal;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void test1() {
        Solution solution=new Solution();
        TreeNode root = new TreeNode(1);
        root.right=new TreeNode(2);
        root.right.left=new TreeNode(3);
        var res = solution.preorderTraversal(root);
        System.out.println("res = " + res);
    }

}