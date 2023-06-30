package LastDayWhereYouCanStillCross;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void test1() {
        Solution solution=new Solution();
        var res = solution.latestDayToCross(2,2,new int[][]{{1,1},{2,1},{1,2},{2,2}});
        assertEquals(2,res);
    }
    @Test
    void test2() {
        Solution solution=new Solution();
        var res = solution.latestDayToCross(2,2,new int[][]{{1,1},{1,2},{2,1},{2,2}});
        assertEquals(1,res);
    }
    @Test
    void test3() {
        Solution solution=new Solution();
        var res = solution.latestDayToCross(3,3,new int[][]{{1,2},{2,1},{3,3},{2,2},{1,1},{1,3},{2,3},{3,2},{3,1}});
        assertEquals(3,res);
    }

}