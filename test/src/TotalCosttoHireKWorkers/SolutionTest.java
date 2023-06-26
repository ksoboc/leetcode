package TotalCosttoHireKWorkers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void test1() {
        Solution solution = new Solution();
        var res = solution.totalCost(new int[]{17, 12, 10, 2, 7, 2, 11, 20, 8}, 3, 4);
        assertEquals(11, res);
    }

    @Test
    void test2() {
        Solution solution = new Solution();
        var res = solution.totalCost(new int[]{1, 2, 4, 1}, 3, 3);
        assertEquals(4, res);
    }

}