package DiameterofBinaryTree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    private Solution solution = new Solution();

    @Test
    void test() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        var res = solution.diameterOfBinaryTree(root);

        assertEquals(3, solution.diameterOfBinaryTree(root));
    }
    @Test
    void test2() {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);


        var res = solution.diameterOfBinaryTree(root);

        assertEquals(1, solution.diameterOfBinaryTree(root));
    }

}