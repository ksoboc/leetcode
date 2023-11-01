package FindModeinBinarySearchTree;

import Common.TreeNode;
import Common.TreeUtil;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class SolutionMorrisTest {
    @Test
    void test1() {
        TreeNode root = TreeUtil.arrayToTree(new Integer[]{1,null,2,2});
        SolutionMorris solution=new SolutionMorris();
        var modes = solution.findMode(root);

        assertArrayEquals(new int[]{2},modes);
    }
    @Test
    void test2() {
        TreeNode root = TreeUtil.arrayToTree(new Integer[]{0});
        SolutionMorris solution=new SolutionMorris();
        var modes = solution.findMode(root);

        assertArrayEquals(new int[]{0},modes);
    }


    @Test
    void test3() {
        TreeNode root = TreeUtil.arrayToTree(new Integer[]{6,2,8,0,4,7,9,null,null,2,6});
        SolutionMorris solution=new SolutionMorris();
        var modes = solution.findMode(root);

        assertArrayEquals(new int[]{2,6},modes);
    }

}