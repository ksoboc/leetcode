package LongestCycleinaGraph;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionKahnTest {
    @Test
    void test1() {
        SolutionKahn solution=new SolutionKahn();
        assertEquals(3, solution.longestCycle(new int[]{3,3,4,2,3}));
    }
    @Test
    void test2() {
        SolutionKahn solution=new SolutionKahn();
        assertEquals(-1, solution.longestCycle(new int[]{2,-1,3,1}));
    }



}