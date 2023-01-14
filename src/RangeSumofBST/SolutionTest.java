package RangeSumofBST;

import Common.TreeNode;
import Common.TreeUtil;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void test1() {
        Solution solution=new Solution();

        TreeNode root = TreeUtil.arrayToTree(new Integer[]{10,5,15,3,7,null,18});
        var res = solution.rangeSumBST(root,7,15);
        System.out.println("res = " + res);
        assertEquals(32,res);
    }
    @Test
    void test2() {
        Solution solution=new Solution();

        TreeNode root = TreeUtil.arrayToTree(new Integer[]{10,5,15,3,7,13,18,1,null,6});
        var res = solution.rangeSumBST(root,6,10);
        System.out.println("res = " + res);
        assertEquals(23,res);
    }

}