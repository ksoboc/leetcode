package ConstructStringfromBinaryTree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void test1() {
        Solution solution=new Solution();
        TreeNode root=new TreeNode(1);
        root.left=new TreeNode(2);
        root.right=new TreeNode(3);
        root.left.left=new TreeNode(4);
        var res=solution.tree2str(root);
        System.out.println("res = " + res);
    }
    @Test
    void test2() {
        Solution solution=new Solution();
        TreeNode root=new TreeNode(1);
        root.left=new TreeNode(2);
        root.right=new TreeNode(3);
        root.left.right=new TreeNode(4);
        var res=solution.tree2str(root);
        System.out.println("res = " + res);
    }

}