package FindifPathExistsinGraph;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void test1() {
        Solution solution=new Solution();

        var res = solution.validPath(3,new int[][]{{0,1},{1,2},{2,0}},0,2);
        assertTrue(res);
    }
    @Test
    void test2() {
        Solution solution=new Solution();

        var res = solution.validPath(6,new int[][]{{0,1},{0,2},{3,5},{5,4},{4,3}},0,5);
        assertFalse(res);
    }

}