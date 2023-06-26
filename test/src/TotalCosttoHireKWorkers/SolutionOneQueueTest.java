package TotalCosttoHireKWorkers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionOneQueueTest {
    @Test
    void test1() {
        SolutionOneQueue solution = new SolutionOneQueue();
        var res = solution.totalCost(new int[]{17, 12, 10, 2, 7, 2, 11, 20, 8}, 3, 4);
        assertEquals(11, res);
    }

    @Test
    void test2() {
        SolutionOneQueue solution = new SolutionOneQueue();
        var res = solution.totalCost(new int[]{1, 2, 4, 1}, 3, 3);
        assertEquals(4, res);
    }

}