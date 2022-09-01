package BinaryTreeLevelOrderTraversal;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void test1() {
        //root = [3,9,20,null,null,15,7]
        TreeNode root = new TreeNode();
        root.val = 3;

        TreeNode nodeL = new TreeNode();
        nodeL.val = 9;

        TreeNode nodeR = new TreeNode();
        nodeR.val = 20;

        root.left = nodeL; root.right = nodeR;

        nodeL = new TreeNode();
        nodeL.val = 15;
        nodeR = new TreeNode();
        nodeR.val = 7;

        root.right.left = nodeL;
        root.right.right = nodeR;

        Solution solution = new Solution();
        System.out.println(solution.levelOrder(root));


    }

    @Test
    void test2() {
        Solution solution = new Solution();
        TreeNode root = new TreeNode();
        root.val = 1;

        System.out.println(solution.levelOrder(root));

    }

    @Test
    void test3() {
        Solution solution = new Solution();
        TreeNode root = null;


        System.out.println(solution.levelOrder(root));

    }


}