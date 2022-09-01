package CarPooling;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    private Solution solution = new Solution();

    @Test
    void testTooLittleCapacity() {
        assertFalse(solution.carPoolingBF(new int[][]{{2,1,5},{3,3,7}},4));
    }

    @Test
    void testEnoughCapacity() {
        assertTrue(solution.carPoolingBF(new int[][]{{2,1,5},{3,3,7}},5));
    }

}