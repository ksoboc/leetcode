package SymmetricTree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void test1() {
        Solution solution=new Solution();

        TreeNode root=new TreeNode(1);
        root.left=new TreeNode(2);
        root.right=new TreeNode(2);

        root.left.left=new TreeNode(3);
        root.left.right=new TreeNode(4);

        root.right.left=new TreeNode(4);
        root.right.right=new TreeNode(3);

        assertTrue(solution.isSymmetric(root));
    }

    @Test
    void test2() {
        Solution solution=new Solution();

        TreeNode root=new TreeNode(1);
        root.left=new TreeNode(2);
        root.right=new TreeNode(2);


        root.left.right=new TreeNode(3);


        root.right.right=new TreeNode(3);

        assertFalse(solution.isSymmetric(root));
    }

}