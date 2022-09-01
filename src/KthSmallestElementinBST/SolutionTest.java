package KthSmallestElementinBST;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private Solution solution = new Solution();

    @Test
    void test() {
        // [3,1,4,null,2], k = 1
        TreeNode root = new TreeNode();
        root.val = 3;

        root.left = new TreeNode();
        root.left.val = 1;
        root.left.left = null;
        root.left.right = new TreeNode();
        root.left.right.val = 2;
        root.left.right.left = null;
        root.left.right.right = null;

        root.right = new TreeNode();
        root.right.val = 4;
        root.right.right = null;
        root.right.left = null;


        System.out.println("solution.kthSmallest(root,1) = " + solution.kthSmallest(root, 1));


    }

}