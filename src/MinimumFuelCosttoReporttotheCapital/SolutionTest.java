package MinimumFuelCosttoReporttotheCapital;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void test1() {
        Solution solution=new Solution();
        assertEquals(3, solution.minimumFuelCost(new int[][]{{0,1},{0,2},{0,3}},5));
    }
    @Test
    void test2() {
        Solution solution=new Solution();
        assertEquals(7, solution.minimumFuelCost(new int[][]{{3,1},{3,2},{1,0},{0,4},{0,5},{4,6}},2));
    }
    @Test
    void test3() {
        Solution solution=new Solution();
        assertEquals(0, solution.minimumFuelCost(new int[][]{},1));
    }

}