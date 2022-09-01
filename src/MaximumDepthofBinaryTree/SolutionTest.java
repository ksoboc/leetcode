package MaximumDepthofBinaryTree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void test() {
        // root = [3,9,20,null,null,15,7]

        TreeNode root = prepareTree();

        Solution solution = new Solution();
        System.out.println("solution.maxDepth(root) = " + solution.maxDepth(root));


    }

    @Test
    void test2() {
        // root = [3,9,20,null,null,15,7]

        TreeNode root = prepareTree();

        Solution solution = new Solution();
//        System.out.println("solution.maxDepth(root) = " + solution.maxDepthNR(root));
        assertEquals(3,solution.maxDepthNR(root));


    }

    @Test
    void test3() {
        // root = [3,9,20,null,null,15,7]

        TreeNode root = prepareTree();

        Solution solution = new Solution();
        System.out.println("solution.maxDepth(root) = " + solution.maxDepthDFSIter(root));


    }

    private TreeNode prepareTree() {
        TreeNode root = new TreeNode();
        root.val = 3;

        TreeNode left = new TreeNode();
        left.val = 9;
        TreeNode right = new TreeNode();
        left.val = 20;

        left.left = null;
        left.right = null;
        root.left = left;
        right.left = new TreeNode();
        right.right = new TreeNode();
        right.left.val = 15;
        right.right.val = 7;
        right.left.left = null;
        right.left.right = null;
        right.right.left = null;
        right.right.right = null;
        root.right = right;
        return root;
    }

}