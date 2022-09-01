package ValidPerfectSquare;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void test() {
        Solution solution = new Solution();
        assertTrue(solution.isPerfectSquare(16));
    }

    @Test
    void test2() {
        Solution solution = new Solution();
        assertFalse(solution.isPerfectSquare(14));
    }

}