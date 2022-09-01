package MostWater;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void test() {
        Solution sol = new Solution();
        int[] height = {1,8,6,2,5,4,8,3,7};
        assertEquals(49, sol.maxArea(height));
    }

}