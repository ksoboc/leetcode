package LongestZigZagPathinaBinaryTree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void test1() {
        Solution solution=new Solution();
        TreeNode root = new TreeNode(1);
        root.left=new TreeNode(2);
        root.right=new TreeNode(3);
        root.right.left=new TreeNode(4);
        root.right.right=new TreeNode(5);
        root.right.left.right=new TreeNode(6);
        root.right.left.right.right=new TreeNode(7);

        assertEquals(3,solution.longestZigZag(root));
    }

}