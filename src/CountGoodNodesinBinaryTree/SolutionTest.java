package CountGoodNodesinBinaryTree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void test1() {
        Solution solution=new Solution();

        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(1);
        root.left.left = new TreeNode(3);
        root.right=new TreeNode(4);
        root.right.left=new TreeNode(1);
        root.right.right=new TreeNode(5);

        assertEquals(4, solution.goodNodes(root));
    }

}