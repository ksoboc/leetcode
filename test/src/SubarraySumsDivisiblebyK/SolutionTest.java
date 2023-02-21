package SubarraySumsDivisiblebyK;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void test1() {
        Solution solution = new Solution();
        assertEquals(7, solution.subarraysDivByK(new int[]{4, 5, 0, -2, -3, 1}, 5));
    }
    @Test
    void test2() {
        Solution solution = new Solution();
        assertEquals(0, solution.subarraysDivByK(new int[]{5}, 9));
    }

}