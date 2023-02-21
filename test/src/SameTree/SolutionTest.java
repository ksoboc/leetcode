package SameTree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void test1() {
        Solution solution=new Solution();
        TreeNode root = new TreeNode(1);
        root.left=new TreeNode(2);
        root.right=new TreeNode(3);

        assertTrue(solution.isSameTree(root,root));
    }
    @Test
    void test2() {
        Solution solution=new Solution();
        TreeNode p = new TreeNode(1);
        p.right=new TreeNode(2);
        TreeNode q =new TreeNode(1);
        q.left=new TreeNode(2);

        assertFalse(solution.isSameTree(p,q));
    }

}