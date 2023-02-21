package PossibleBipartition;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void test1() {
        Solution solution=new Solution();

        var res = solution.possibleBipartition(4, new int[][]{{1,2},{1,3},{2,4}});
        assertTrue(res);
    }
    @Test
    void test2() {
        Solution solution=new Solution();

        var res = solution.possibleBipartition(3, new int[][]{{1,2},{1,3},{2,3}});
        assertFalse(res);
    }

}