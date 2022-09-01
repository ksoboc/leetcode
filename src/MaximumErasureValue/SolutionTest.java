package MaximumErasureValue;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    private Solution solution = new Solution();

    @Test
    void test() {
        assertEquals(17, solution.maximumUniqueSubarray(new int[]{4,2,4,5,6}));
    }

    @Test
    void test2() {
        assertEquals(8, solution.maximumUniqueSubarray(new int[]{5,2,1,2,5,2,1,2,5}));
    }

}