package NumberofProvinces;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void test1() {
        Solution solution=new Solution();
        assertEquals(2, solution.findCircleNum(new int[][]{{1,1,0},{1,1,0},{0,0,1}}));
    }
    @Test
    void test2() {
        Solution solution=new Solution();
        assertEquals(3, solution.findCircleNum(new int[][]{{1,0,0},{0,1,0},{0,0,1}}));
    }

}