package MaxPointsonaLine;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void test1() {
        Solution solution=new Solution();

        assertEquals(3, solution.maxPoints(new int[][]{{1,1},{2,2},{3,3}}));
    }
    //[[1,0],[0,0]]
    @Test
    void test2() {
        Solution solution=new Solution();

        assertEquals(2, solution.maxPoints(new int[][]{{1,0},{0,0}}));
    }
}