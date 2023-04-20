package MaximumWidthofBinaryTree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionBFSTest {
    @Test
    void test1() {
        SolutionBFS solution=new SolutionBFS();
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