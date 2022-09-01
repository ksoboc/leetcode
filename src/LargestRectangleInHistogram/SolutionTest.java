package LargestRectangleInHistogram;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    private Solution solution=new Solution();

    @Test
    void test() {
        assertEquals(10, solution.largestRectangleArea(new int[]{2,1,5,6,2,3}));
    }
    @Test
    void test2() {
        assertEquals(4, solution.largestRectangleArea(new int[]{2,4}));
    }

}