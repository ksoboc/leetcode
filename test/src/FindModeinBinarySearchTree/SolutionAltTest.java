package FindModeinBinarySearchTree;

import Common.TreeNode;
import Common.TreeUtil;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class SolutionAltTest {
    @Test
    void test1() {
        TreeNode root = TreeUtil.arrayToTree(new Integer[]{1,null,2,2});
        SolutionAlt solution=new SolutionAlt();
        var modes = solution.findMode(root);

        assertArrayEquals(new int[]{2},modes);
    }
    @Test
    void test2() {
        TreeNode root = TreeUtil.arrayToTree(new Integer[]{0});
        SolutionAlt solution=new SolutionAlt();
        var modes = solution.findMode(root);
        assertArrayEquals(new int[]{0},modes);
    }


    @Test
    void test3() {
        TreeNode root = TreeUtil.arrayToTree(new Integer[]{1,0,1,0,0,1,1,0});
        SolutionAlt solution=new SolutionAlt();
        var modes = solution.findMode(root);
        assertArrayEquals(new int[]{0,1},modes);


    }

}