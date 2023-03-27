package LongestCycleinaGraph;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void test1() {
        Solution solution=new Solution();
        assertEquals(3, solution.longestCycle(new int[]{3,3,4,2,3}));
    }
    @Test
    void test2() {
        Solution solution=new Solution();
        assertEquals(-1, solution.longestCycle(new int[]{2,-1,3,1}));
    }



}