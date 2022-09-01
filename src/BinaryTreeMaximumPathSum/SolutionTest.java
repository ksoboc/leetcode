package BinaryTreeMaximumPathSum;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    private Solution solution;
    @BeforeEach
    void init() {
        solution = new Solution();
    }

    @Test
    void test1() {
        TreeNode root = new TreeNode(1);
        root.left=new TreeNode(2);
        root.right=new TreeNode(3);

        assertEquals(6,solution.maxPathSum(root));
    }

    @Test
    void test2() {
        TreeNode root = new TreeNode(-9);
        root.left=new TreeNode(10);
        root.right=new TreeNode(20);
        root.right.right = new TreeNode(15);
        root.right.left = new TreeNode(7);

        assertEquals(42,solution.maxPathSum(root));
    }

    @Test
    void test3() {
        TreeNode root = new TreeNode(-3);
        assertEquals(-3,solution.maxPathSum(root));

    }


}