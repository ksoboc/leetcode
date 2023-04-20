package MaximumWidthofBinaryTree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void test1() {
        Solution solution=new Solution();
        TreeNode root=new TreeNode(1);
        root.left=new TreeNode(3);
        root.right=new TreeNode(2);
        root.left.left=new TreeNode(5);
        root.left.right=new TreeNode(3);
        root.right.right=new TreeNode(9);
        var res = solution.widthOfBinaryTree(root);
        assertEquals(4,res);
    }

}