package AddOneRowtoTree;

import Common.TreeNode;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void test1() {
        Solution solution=new Solution();
        TreeNode root = Common.TreeUtil.arrayToTree(new Integer[]{4,2,6,3,1,5});
        var res = solution.addOneRow(root,1,2);
        var resArr = Common.TreeUtil.treeToArray(res);
        System.out.println("Arrays.toString(resArr) = " + Arrays.toString(resArr));
    }

    @Test
    void test2() {
        Solution solution=new Solution();
        TreeNode root = Common.TreeUtil.arrayToTree(new Integer[]{4,2,null,3,1});
        var res = solution.addOneRow(root,1,3);
        var resArr = Common.TreeUtil.treeToArray(res);
        System.out.println("Arrays.toString(resArr) = " + Arrays.toString(resArr));
    }
    @Test
    void test3() {
        Solution solution=new Solution();
        TreeNode root = Common.TreeUtil.arrayToTree(new Integer[]{1,2,3,4});
        var res = solution.addOneRow(root,5,4);
        var resArr = Common.TreeUtil.treeToArray(res);
        System.out.println("Arrays.toString(resArr) = " + Arrays.toString(resArr));
    }

}