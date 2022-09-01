package ConstructBinaryTreefromPreorderandInorderTraversal;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void test() {
        int[] preorder = {3,9,20,15,7};
        int[] inorder = {9,3,15,20,7};

        Solution solution = new Solution();

        var root = solution.buildTree(preorder,inorder);
        System.out.println("root = " + root);

    }

    @Test
    void test2() {
        int[] preorder = {-1};
        int[] inorder = {-1};

        Solution solution = new Solution();

        var root = solution.buildTree(preorder,inorder);
        System.out.println("root = " + root);
    }

}