package DeleteNodesAndReturnForest;

import Common.TreeNode;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void test1() {
        Solution solution=new Solution();

        TreeNode root = Common.TreeUtil.arrayToTree(new Integer[]{1,2,3,4,5,6,7});
        var res = solution.delNodes(root, new int[]{3,5});

        List<String> pres = new ArrayList<>();
        res.forEach(x->pres.add(Arrays.deepToString(Common.TreeUtil.treeToArray(x))));
        System.out.println("res = " + pres);
    }
    @Test
    void test2() {
        Solution solution=new Solution();

        TreeNode root = Common.TreeUtil.arrayToTree(new Integer[]{1,2,4,null,3});
        var res = solution.delNodes(root, new int[]{3});

        List<String> pres = new ArrayList<>();
        res.forEach(x->pres.add(Arrays.deepToString(Common.TreeUtil.treeToArray(x))));
        System.out.println("res = " + pres);
    }


}