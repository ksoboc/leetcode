package RottingOranges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    private Solution solution = new Solution();

    @Test
    void test() {
        var res=solution.orangesRotting(new int[][]{{2,1,1},{1,1,0},{0,1,1}});
        assertEquals(4,res);
    }
    @Test
    void test2() {
        var res=solution.orangesRotting(new int[][]{{2,1,1},{0,1,1},{1,0,1}});
        assertEquals(-1,res);
    }
    @Test
    void test3() {
        var res=solution.orangesRotting(new int[][]{{0,2}});
        assertEquals(0,res);
    }
}