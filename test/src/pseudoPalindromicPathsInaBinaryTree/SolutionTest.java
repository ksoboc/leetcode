package pseudoPalindromicPathsInaBinaryTree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void test1() {
        Solution solution=new Solution();
        TreeNode root=new TreeNode(2);
        root.left=new TreeNode(3);
        root.right=new TreeNode(1);
        root.left.left=new TreeNode(3);
        root.left.right=new TreeNode(1);

        root.right.right=new TreeNode(1);

        assertEquals(2,solution.pseudoPalindromicPaths(root));

    }
    @Test
    void test3() {
        Solution solution=new Solution();
        TreeNode root=new TreeNode(9);

        assertEquals(1,solution.pseudoPalindromicPaths(root));

    }

}