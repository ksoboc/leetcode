package MinimumDistanceBetweenBSTNodes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void test1() {
        Solution solution=new Solution();
        TreeNode root=new TreeNode(4);
        root.left=new TreeNode(2);
        root.left.left=new TreeNode(1);
        root.left.right=new TreeNode(3);
        root.right=new TreeNode(6);
        assertEquals(1, solution.minDiffInBST(root));
    }
    @Test
    void test2() {
        Solution solution=new Solution();
        TreeNode root=new TreeNode(1);
        root.left=new TreeNode(0);
        root.right=new TreeNode(48);
        root.right.left=new TreeNode(12);
        root.right.right=new TreeNode(49);

        assertEquals(1, solution.minDiffInBST(root));
    }

}