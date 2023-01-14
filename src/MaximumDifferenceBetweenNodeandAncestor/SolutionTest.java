package MaximumDifferenceBetweenNodeandAncestor;

import Common.TreeUtil;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void test1() {
        Solution solution=new Solution();
        var root= TreeUtil.arrayToTree(new Integer[]{8,3,10,1,6,null,14,null,null,4,7,13});
        var res = solution.maxAncestorDiff(root);
        assertEquals(7,res);
    }
    @Test
    void test2() {
        Solution solution=new Solution();
        var root= TreeUtil.arrayToTree(new Integer[]{1,null,2,null,0,3});
        var res = solution.maxAncestorDiff(root);
        assertEquals(3,res);
    }

}