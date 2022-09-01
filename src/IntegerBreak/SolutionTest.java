package IntegerBreak;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    private Solution solution=new Solution();

    @Test
    void test() {
        assertEquals(4, solution.integerBreak(4));
    }

    @Test
    void test2() {
        assertEquals(36, solution.integerBreak(10));
    }

}