package MinimumDepthofBinaryTree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionBFSTest {
    @Test
    void test1() {
        SolutionBFS solution=new SolutionBFS();
        TreeNode root=new TreeNode(3);
        root.left=new TreeNode(9);
        root.right=new TreeNode(20);
        root.right.left=new TreeNode(15);
        root.right.right=new TreeNode(7);

        var res=solution.minDepth(root);
        assertEquals(2,res);
    }
    @Test
    void test2() {
        SolutionBFS solution=new SolutionBFS();

        TreeNode root=new TreeNode(2);
        root.right=new TreeNode(3);
        root.right.right=new TreeNode(4);
        root.right.right.right=new TreeNode(5);
        root.right.right.right.right=new TreeNode(6);

        var res=solution.minDepth(root);
        assertEquals(5,res);
    }
    @Test
    void test3() {
        SolutionBFS solution=new SolutionBFS();
        TreeNode root=new TreeNode(1);
        root.left=new TreeNode(2);
        root.right=new TreeNode(3);
        root.left.left=new TreeNode(4);
        root.left.right=new TreeNode(5);

        var res=solution.minDepth(root);
        assertEquals(2,res);
    }
}