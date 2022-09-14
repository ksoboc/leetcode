package PseudoPalindromicPathsinaBinaryTree;

import Common.TreeUtil;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    @Test
    void test1() {
        Solution solution=new Solution();
        var root = TreeUtil.arrayToTree(new Integer[]{2,3,1,3,1,null,1});
        assertEquals(2,solution.pseudoPalindromicPaths(root));

    }
    @Test
    void test2() {
        Solution solution=new Solution();
        var root = TreeUtil.arrayToTree(new Integer[]{2,1,1,1,3,null,null,null,null,null,1});
        assertEquals(1,solution.pseudoPalindromicPaths(root));

    }
    @Test
    void test3() {
        Solution solution=new Solution();
        var root = TreeUtil.arrayToTree(new Integer[]{9});
        assertEquals(1,solution.pseudoPalindromicPaths(root));

    }

}