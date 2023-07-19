package NonoverlappingIntervals;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionFasterTest {
    @Test
    void test1() {
        SolutionFaster solution=new SolutionFaster();
        int[][] intervals = {{1,2},{2,3},{3,4},{1,3}};
        var res = solution.eraseOverlapIntervals(intervals);
        assertEquals(1,res);
    }
    @Test
    void test2() {
        SolutionFaster solution=new SolutionFaster();
        int[][] intervals = {{1,2},{1,2},{1,2}};
        var res = solution.eraseOverlapIntervals(intervals);
        assertEquals(2,res);
    }
    @Test
    void test3() {
        SolutionFaster solution=new SolutionFaster();
        int[][] intervals = {{1,2},{2,3}};
        var res = solution.eraseOverlapIntervals(intervals);
        assertEquals(0,res);
    }

    @Test
    void test4() {
        SolutionFaster solution=new SolutionFaster();
        int[][] intervals = {{0,2},{1,3},{2,4},{3,5},{4,6}};
        var res = solution.eraseOverlapIntervals(intervals);
        assertEquals(2,res);
    }

}