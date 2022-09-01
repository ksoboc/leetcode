package TrappedWater;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void testBF() {
        Solution sol = new Solution();

        int[] height = {4,2,0,3,2,5};
        assertEquals(9, sol.trapBF(height));
    }

    @Test
    void testDP() {
        Solution sol = new Solution();

        int[] height = {4,2,0,3,2,5};
        assertEquals(9, sol.trapDP(height));
    }

    @Test
    void testTP() {
        Solution sol = new Solution();

        int[] height = {4,2,0,3,2,5};
        assertEquals(9, sol.trapTwoPointer(height));

    }

    @Test
    void testStack() {
        Solution sol = new Solution();

        int[] height = {4,2,0,3,2,5};
        assertEquals(9, sol.trapStack(height));
    }

    @Test
    void testStack2() {
        Solution sol = new Solution();

        int[] height = {0,1,0,2,1,0,1,3,2,1,2,1};
        assertEquals(6, sol.trapStack(height));
    }
}