package VerticalOrderTraversalofaBinaryTree;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void test1() {
        TreeNode root = new TreeNode(3);
        root.left=new TreeNode(9);
        root.right=new TreeNode(20);
        root.right.left=new TreeNode(15);
        root.right.right=new TreeNode(7);

        Solution solution=new Solution();
        var res = solution.verticalTraversal(root);
        System.out.println("res = " + res);
    }
    @Test
    void test2() {
        TreeNode root = new TreeNode(1);
        root.left=new TreeNode(2);
        root.right=new TreeNode(3);
        root.left.left=new TreeNode(4);
        root.left.right=new TreeNode(5);
        root.right.left=new TreeNode(6);
        root.right.right=new TreeNode(7);

        Solution solution=new Solution();
        var res = solution.verticalTraversal(root);
        System.out.println("res = " + res);
    }

}