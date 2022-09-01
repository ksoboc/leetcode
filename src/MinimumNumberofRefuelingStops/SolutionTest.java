package MinimumNumberofRefuelingStops;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void test1() {
        Solution solution=new Solution();
        assertEquals(0, solution.minRefuelStops(1,1,new int[][]{}));
    }
    @Test
    void test2() {
        Solution solution=new Solution();
        assertEquals(-1, solution.minRefuelStops(100,1,new int[][]{{10,100}}));
    }
    @Test
    void test3() {
        Solution solution=new Solution();
        assertEquals(2, solution.minRefuelStops(100,10,new int[][]{{10,60},{20,30},{30,30},{60,40}}));
    }

}