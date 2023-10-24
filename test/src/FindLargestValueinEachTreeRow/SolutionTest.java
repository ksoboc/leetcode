package FindLargestValueinEachTreeRow;

import org.junit.jupiter.api.Test;

import Common.TreeNode;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void test1() {
        Solution solution=new Solution();
        TreeNode root = Common.TreeUtil.arrayToTree(new Integer[]{1,3,2,5,3,null,9});
        var res = solution.largestValues(root);
        assertEquals(List.of(1,3,9),res);
    }
    @Test
    void test2() {
        Solution solution=new Solution();
        TreeNode root = Common.TreeUtil.arrayToTree(new Integer[]{1,2,3});
        var res = solution.largestValues(root);
        assertEquals(List.of(1,3),res);
    }

}