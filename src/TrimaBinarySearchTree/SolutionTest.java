package TrimaBinarySearchTree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    private Solution solution = new Solution();

    @Test
    void test() {
        TreeNode root = new TreeNode(1);
        root.left=new TreeNode(0);
        root.right=new TreeNode(2);

        solution.trimBST(root,1,2);

        assertEquals(null,root.left);
    }
    @Test
    void test2() {
        TreeNode root = new TreeNode(3);
        root.left=new TreeNode(0);
        root.right=new TreeNode(4);
        root.left.right=new TreeNode(2);
        root.left.right.left=new TreeNode(1);

        solution.trimBST(root,1,3);

        assertEquals(2,root.left.val);
    }

}