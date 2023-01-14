package MaximumProductofSplittedBinaryTree;

import Common.TreeUtil;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void test1() {
        Solution solution=new Solution();
        var res = solution.maxProduct(TreeUtil.arrayToTree(new Integer[]{1,2,3,4,5,6}));
        assertEquals(110, res);
    }
    @Test
    void test2() {
        Solution solution=new Solution();
        var res = solution.maxProduct(TreeUtil.arrayToTree(new Integer[]{1,null,2,3,4,null,null,5,6}));
        assertEquals(90, res);
    }
    @Test
    void test3() {
        Solution solution=new Solution();
        var res = solution.maxProduct(TreeUtil.arrayToTree(new Integer[]{1,null,2,3,4,null,null,5,6}));
        assertEquals(90, res);
    }

}