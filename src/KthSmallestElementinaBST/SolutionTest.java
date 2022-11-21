package KthSmallestElementinaBST;

import Common.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void test1() {
        Solution solution=new Solution();
        TreeNode root = Common.TreeUtil.arrayToTree(new Integer[]{3,1,4,null,2});
        assertEquals(1,solution.kthSmallest(root,1));
    }

    @Test
    void test2() {
        Solution solution=new Solution();
        TreeNode root = Common.TreeUtil.arrayToTree(new Integer[]{5,3,6,2,4,null,null,1});
        assertEquals(3,solution.kthSmallest(root,3));
    }
    @Test
    void test3() {
        Solution solution=new Solution();
        TreeNode root = Common.TreeUtil.arrayToTree(new Integer[]{1,null,2});
        assertEquals(2,solution.kthSmallest(root,2));
    }
}