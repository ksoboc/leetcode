package MaximumLevelSumofaBinaryTree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void test1() {
        Solution solution=new Solution();
        TreeNode root=new TreeNode(1);
        root.left=new TreeNode(7);
        root.right=new TreeNode(0);
        root.left.left=new TreeNode(7);
        root.left.right=new TreeNode(-8);

        assertEquals(2,solution.maxLevelSum(root));
    }
    @Test
    void test2() {
        Solution solution=new Solution();
        TreeNode root=new TreeNode(989);
        root.right=new TreeNode(10250);
        root.right.left=new TreeNode(98693);
        root.right.right=new TreeNode(-89388);
        root.right.right.right=new TreeNode(-32127);

        assertEquals(2,solution.maxLevelSum(root));
    }

}