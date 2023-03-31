package ConstructBinaryTreefromInorderandPostorderTraversal;

import Common.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionIterTest {
    @Test
    void testEmptyTables() {
        SolutionIter solution = new SolutionIter();
        int[] inorder = new int[0];
        int[] postorder = new int[0];

        TreeNode result = solution.buildTree(inorder, postorder);
        assertNull(result);

    }

    @Test
    void testOneElement() {
        int[] inorder = new int[] {1};
        int[] postorder = new int[] {1};
        SolutionIter solution = new SolutionIter();
        TreeNode result = solution.buildTree(inorder, postorder);
        assertEquals(1, result.val);
        assertNull(result.left);
        assertNull(result.right);

    }

    @Test
    void testManyElements() {
        int[] inorder = new int[] {9, 3, 15, 20, 7};
        int[] postorder = new int[] {9, 15, 7, 20, 3};
        SolutionIter solution = new SolutionIter();
        TreeNode result = solution.buildTree(inorder, postorder);
        assertEquals(3, result.val);
        assertEquals(9, result.left.val);
        assertNull(result.left.left);
        assertNull(result.left.right);
        assertEquals(20, result.right.val);
        assertEquals(15, result.right.left.val);
        assertEquals(7, result.right.right.val);
        assertNull(result.right.left.left);
        assertNull(result.right.left.right);
        assertNull(result.right.right.left);
        assertNull(result.right.right.right);

    }



}