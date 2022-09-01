package PacificAtlanticWaterFlow;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void test1() {
        Solution solution=new Solution();

        int[][] heights = {{1,2,2,3,5},{3,2,3,4,4},{2,4,5,3,1},{6,7,1,4,5},{5,1,1,2,4}};
        var res = solution.pacificAtlantic(heights);
        System.out.println("res = " + res);
    }

}