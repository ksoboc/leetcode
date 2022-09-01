package BinaryTreeInorderTraversal;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void test1() {
        Solution solution = new Solution();
        TreeNode root = new TreeNode(1);
        root.right = new TreeNode(2);
        root.right.left = new TreeNode(3);

        System.out.println("solution.inorderTraversal(root) = " + solution.inorderTraversal(root));
    }

    @Test
    void test2() {
        Solution solution = new Solution();
        TreeNode root = null;


        System.out.println("solution.inorderTraversal(root) = " + solution.inorderTraversal(root));
    }

    @Test
    void test3() {
        Solution solution = new Solution();
        TreeNode root = new TreeNode(1);


        System.out.println("solution.inorderTraversal(root) = " + solution.inorderTraversal(root));
    }

}