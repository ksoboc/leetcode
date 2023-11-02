package CountNodesEqualtoAverageofSubtree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void test1() {
        Solution solution=new Solution();
        TreeNode root = new TreeNode(4);
        root.left=new TreeNode(8);
        root.right=new TreeNode(5);

        root.left.left=new TreeNode(0);
        root.left.right=new TreeNode(1);

        root.right.right=new TreeNode(6);

        var res = solution.averageOfSubtree(root);
        assertEquals(5,res);
    }
    @Test
    void test2() {
        Solution solution=new Solution();
        TreeNode root = new TreeNode(1);

        var res = solution.averageOfSubtree(root);
        assertEquals(1,res);
    }

}