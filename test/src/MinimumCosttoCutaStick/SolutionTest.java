package MinimumCosttoCutaStick;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void test1() {
        Solution solution=new Solution();
        assertEquals(16, solution.minCost(7, new int[]{1,3,4,5}));
    }
    @Test
    void test2() {
        Solution solution=new Solution();
        assertEquals(22, solution.minCost(9, new int[]{5,6,1,4,2}));
    }

}