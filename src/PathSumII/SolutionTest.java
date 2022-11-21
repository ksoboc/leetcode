package PathSumII;

import Common.TreeNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void test1() {
        Solution solution=new Solution();
        TreeNode root = Common.TreeUtil.arrayToTree(new Integer[]{5,4,8,11,null,13,4,7,2,null,null,5,1});
        var res = solution.pathSum(root,22);
        System.out.println("res = " + res);
    }
    @Test
    void test2() {
        Solution solution=new Solution();
        TreeNode root = Common.TreeUtil.arrayToTree(new Integer[]{1,2,3});
        var res = solution.pathSum(root,5);
        System.out.println("res = " + res);
    }
    @Test
    void test3() {
        Solution solution=new Solution();
        TreeNode root = Common.TreeUtil.arrayToTree(new Integer[]{1,2});
        var res = solution.pathSum(root,0);
        System.out.println("res = " + res);
    }

}