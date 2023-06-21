package MinimumCosttoMakeArrayEqual;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionBSTest {
    @Test
    void test1() {
        SolutionBS solution=new SolutionBS();

        assertEquals(8, solution.minCost(new int[]{1,3,5,2}, new int[]{2,3,1,14}));
    }
    @Test
    void test2() {
        SolutionBS solution=new SolutionBS();

        assertEquals(0, solution.minCost(new int[]{2,2,2,2,2}, new int[]{4,2,8,1,3}));
    }

}