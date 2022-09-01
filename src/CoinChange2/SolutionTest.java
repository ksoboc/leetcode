package CoinChange2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    private Solution solution=new Solution();

    @Test
    void test() {
        assertEquals(4, solution.change(5, new int[]{1,2,5}));
    }

    @Test
    void test2() {
        assertEquals(0, solution.change(3, new int[]{2}));
    }

    @Test
    void test3() {
        assertEquals(1, solution.change(10, new int[]{10}));
    }

}