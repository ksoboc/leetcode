package BinaryTreeRightSideView;

import org.junit.jupiter.api.Test;

class SolutionTest {
    private Solution solution = new Solution();

    @Test
    void test() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        root.left.right = new TreeNode(5);
        root.right.right = new TreeNode(4);

        var res = solution.rightSideViewDFS(root);
        System.out.println("res = " + res);


    }
    @Test
    void test1a() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        root.left.right = new TreeNode(5);
        root.right.right = new TreeNode(4);

        var res = solution.rightSideViewBFS(root);
        System.out.println("res = " + res);


    }

    @Test
    void test2() {
        TreeNode root = new TreeNode(1);

        root.right = new TreeNode(3);



        var res = solution.rightSideViewDFS(root);
        System.out.println("res = " + res);


    }
    @Test
    void test2a() {
        TreeNode root = new TreeNode(1);

        root.right = new TreeNode(3);



        var res = solution.rightSideViewBFS(root);
        System.out.println("res = " + res);


    }

    @Test
    void test3() {
        TreeNode root = null;
        var res = solution.rightSideViewDFS(root);
        System.out.println("res = " + res);
    }
}