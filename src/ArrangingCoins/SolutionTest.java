package ArrangingCoins;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void test1() {
        Solution solution = new Solution();

        assertEquals(2, solution.arrangeCoins(5));
    }

    @Test
    void test2() {
        Solution solution = new Solution();

        assertEquals(3, solution.arrangeCoins(8));
    }

}