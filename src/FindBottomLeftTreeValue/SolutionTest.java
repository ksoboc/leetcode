package FindBottomLeftTreeValue;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    private Solution solution = new Solution();

    @Test
    void test() {
        TreeNode root = new TreeNode(2);
        root.left=new TreeNode(1);
        root.right=new TreeNode(3);

        assertEquals(1,solution.findBottomLeftValue(root));
    }

    @Test
    void test2() {
        TreeNode root = new TreeNode(1);
        root.left=new TreeNode(2);
        root.right=new TreeNode(3);

        root.left.left=new TreeNode(4);

        root.right.left=new TreeNode(5);
        root.right.right=new TreeNode(6);

        root.right.left.left=new TreeNode(7);

        assertEquals(7,solution.findBottomLeftValue(root));
    }

}