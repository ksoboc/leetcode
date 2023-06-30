package LastDayWhereYouCanStillCross;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SolutionUFTest {
    @Test
    void test1() {
        SolutionUF solution=new SolutionUF();
        var res = solution.latestDayToCross(2,2,new int[][]{{1,1},{2,1},{1,2},{2,2}});
        assertEquals(2,res);
    }
    @Test
    void test2() {
        SolutionUF solution=new SolutionUF();
        var res = solution.latestDayToCross(2,2,new int[][]{{1,1},{1,2},{2,1},{2,2}});
        assertEquals(1,res);
    }
    @Test
    void test3() {
        SolutionUF solution=new SolutionUF();
        var res = solution.latestDayToCross(3,3,new int[][]{{1,2},{2,1},{3,3},{2,2},{1,1},{1,3},{2,3},{3,2},{3,1}});
        assertEquals(3,res);
    }


}