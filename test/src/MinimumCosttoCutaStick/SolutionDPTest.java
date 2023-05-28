package MinimumCosttoCutaStick;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionDPTest {
    @Test
    void test1() {
        SolutionDP solution=new SolutionDP();
        assertEquals(16, solution.minCost(7, new int[]{1,3,4,5}));
    }
    @Test
    void test2() {
        SolutionDP solution=new SolutionDP();
        assertEquals(22, solution.minCost(9, new int[]{5,6,1,4,2}));
    }

}