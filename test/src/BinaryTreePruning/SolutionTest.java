package BinaryTreePruning;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void test1() {
        Solution solution=new Solution();

        TreeNode root=new TreeNode(1);
        root.right=new TreeNode(0);
        root.right.left=new TreeNode(0);
        root.right.right=new TreeNode(1);

        solution.pruneTree(root);

        System.out.println("root.val = " + root.val);

    }

}