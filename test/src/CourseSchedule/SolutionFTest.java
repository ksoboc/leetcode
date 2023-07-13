package CourseSchedule;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionFTest {
    @Test
    void test1() {
        SolutionF solution = new SolutionF();
        var res=solution.canFinish(2,new int[][]{{1,0}});
        assertTrue(res);
    }
    @Test
    void test2() {
        SolutionF solution = new SolutionF();
        var res=solution.canFinish(2,new int[][]{{1,0},{0,1}});
        assertFalse(res);
    }

}