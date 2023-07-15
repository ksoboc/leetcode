package MaximumNumberofEventsThatCanBeAttendedII;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void test1() {
        Solution solution=new Solution();
        var res=solution.maxValue(new int[][]{{1,2,4},{3,4,3},{2,3,1}},2);
        assertEquals(7,res);
    }
    @Test
    void test2() {
        Solution solution=new Solution();
        var res=solution.maxValue(new int[][]{{1,2,4},{3,4,3},{2,3,10}},2);
        assertEquals(10,res);
    }
    @Test
    void test3() {
        Solution solution=new Solution();
        var res=solution.maxValue(new int[][]{{1,1,1},{2,2,2},{3,3,3},{4,4,4}},3);
        assertEquals(9,res);
    }

}