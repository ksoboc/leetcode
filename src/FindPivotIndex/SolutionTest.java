package FindPivotIndex;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    private Solution solution = new Solution();

    @Test
    void test() {
        assertEquals(3, solution.pivotIndex(new int[]{1,7,3,6,5,6}));
    }

    @Test
    void test2() {
        assertEquals(-1, solution.pivotIndex(new int[]{1,2,3}));
    }


}