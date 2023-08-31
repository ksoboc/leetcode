package MinimumNumberofTapstoOpentoWateraGarden;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void test1() {
        Solution solution=new Solution();
        int[] ranges = {3,4,1,1,0,0};
        var res = solution.minTaps(5,ranges);
        assertEquals(1,res);
    }
    @Test
    void test2() {
        Solution solution=new Solution();
        int[] ranges = {0,0,0,0};
        var res = solution.minTaps(3,ranges);
        assertEquals(-1,res);
    }
    //
    @Test
    void test3() {
        Solution solution=new Solution();
        int[] ranges = {1,2,1,0,2,1,0,1};
        var res = solution.minTaps(7,ranges);
        assertEquals(3,res);
    }

}