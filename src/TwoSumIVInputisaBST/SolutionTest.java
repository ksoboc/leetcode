package TwoSumIVInputisaBST;

import Common.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void test1() {
        Solution solution=new Solution();
        TreeNode root = Common.TreeUtil.arrayToTree(new Integer[]{5,3,6,2,4,null,7});
        assertTrue(solution.findTarget(root,9));
    }
    @Test
    void test2() {
        Solution solution=new Solution();
        TreeNode root = Common.TreeUtil.arrayToTree(new Integer[]{5,3,6,2,4,null,7});
        assertFalse(solution.findTarget(root,28));
    }

}