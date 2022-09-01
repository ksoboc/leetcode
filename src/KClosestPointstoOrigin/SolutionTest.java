package KClosestPointstoOrigin;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    private Solution solution = new Solution();

    @Test
    void test() {
        var res=solution.kClosest(new int[][]{{1,3},{-2,2}},1);

        assertArrayEquals(new int[][]{{-2,2}}, res);
        System.out.println("res = " + Arrays.deepToString(res));
    }

    @Test
    void test2() {
        var res = solution.kClosest(new int[][]{{3,3},{5,-1},{-2,4}},2);
        System.out.println("res = " + Arrays.deepToString(res));
        assertArrayEquals(new int[][]{{3,3},{-2,4}},res);
    }

}