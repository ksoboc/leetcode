package ValidParentheses;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    private Solution solution = new Solution();
    @Test
    void test() {
        assertTrue(solution.isValid("()"));
    }

    @Test
    void test2() {
        assertTrue(solution.isValid("()[]{}"));
    }

    @Test
    void test3() {
        assertFalse(solution.isValid("(]"));
    }
}