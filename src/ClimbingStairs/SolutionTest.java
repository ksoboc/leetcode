package ClimbingStairs;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void test() {
        Solution solution = new Solution();
        assertEquals(2, solution.climbStairs(2));
        assertEquals(3, solution.climbStairs(3));
    }

}