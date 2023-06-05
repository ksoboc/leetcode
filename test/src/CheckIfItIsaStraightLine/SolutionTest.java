package CheckIfItIsaStraightLine;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void test1() {
        Solution solution=new Solution();
        assertTrue(solution.checkStraightLine(new int[][]{{1,2},{2,3},{3,4},{4,5},{5,6},{6,7}}));
    }
    @Test
    void test2() {
        Solution solution=new Solution();
        assertFalse(solution.checkStraightLine(new int[][]{{1,1},{2,2},{3,4},{4,5},{5,6},{7,7}}));
    }

}