package BinaryTreeZigzagLevelOrderTraversal;

import Common.TreeNode;
import Common.TreeUtil;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void test1() {
        Solution solution=new Solution();
        TreeNode root = TreeUtil.arrayToTree(new Integer[]{3,9,20,null,null,15,7});
        var res = solution.zigzagLevelOrder(root);
        System.out.println("res = " + res);
    }
    //
    @Test
    void test2() {
        Solution solution=new Solution();
        TreeNode root = TreeUtil.arrayToTree(new Integer[]{1,2,3,4,null,null,5});
        var res = solution.zigzagLevelOrder(root);
        System.out.println("res = " + res);
    }
}