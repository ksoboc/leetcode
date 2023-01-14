package LeafSimilarTrees;

import Common.TreeUtil;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void test1() {
        Solution solution=new Solution();

        var root1= TreeUtil.arrayToTree(new Integer[]{3,5,1,6,2,9,8,null,null,7,4});
        var root2 = TreeUtil.arrayToTree(new Integer[]{3,5,1,6,7,4,2,null,null,null,null,null,null,9,8});
        var res = solution.leafSimilar(root1,root2);
        assertTrue(res);
    }
    @Test
    void test2() {
        Solution solution=new Solution();

        var root1= TreeUtil.arrayToTree(new Integer[]{1,2,3});
        var root2 = TreeUtil.arrayToTree(new Integer[]{1,3,2});
        var res = solution.leafSimilar(root1,root2);
        assertFalse(res);
    }

}