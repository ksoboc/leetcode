package ErectTheFence;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void test1() {
        Solution solution=new Solution();

        var res = solution.outerTrees(new int[][]{{1,1},{2,2},{2,0},{2,4},{3,3},{4,2}});
        System.out.println("Arrays.deepToString(res) = " + Arrays.deepToString(res));
    }
    @Test
    void test2() {
        Solution solution=new Solution();

        var res = solution.outerTrees(new int[][]{{1,2},{2,2},{4,2}});
        System.out.println("Arrays.deepToString(res) = " + Arrays.deepToString(res));
    }

}