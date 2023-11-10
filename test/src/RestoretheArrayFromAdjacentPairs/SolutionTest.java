package RestoretheArrayFromAdjacentPairs;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void test1() {
        Solution solution=new Solution();
        int[][] adjPairs = {{2,1},{3,4},{3,2}};
        var res = solution.restoreArray(adjPairs);
        System.out.println("Arrays.toString(res) = " + Arrays.toString(res));
    }

    @Test
    void test2() {
        Solution solution=new Solution();
        int[][] adjPairs = {{4,-2},{1,4},{-3,1}};
        var res = solution.restoreArray(adjPairs);
        System.out.println("Arrays.toString(res) = " + Arrays.toString(res));
    }
    @Test
    void test3() {
        Solution solution=new Solution();
        int[][] adjPairs = {};
        var res = solution.restoreArray(adjPairs);
        System.out.println("Arrays.toString(res) = " + Arrays.toString(res));
    }

}