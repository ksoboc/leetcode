package PaintHouse;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    private Solution solution = new Solution();

    @Test
    void test() {
        assertEquals(10, solution.minCost(new int[][]{{14, 2, 11}, {11, 14, 5}, {14, 3, 10}}));
    }

    @Test
    void test2() {
        assertEquals(3, solution.minCost(new int[][]{{1, 2, 3}, {1, 4, 6}}));
    }
}