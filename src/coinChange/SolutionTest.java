package coinChange;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void test() {
        Solution solution = new Solution();
        int[] coins = {1,2,5};
        var amount = 11;

        assertEquals(3, solution.coinChange(coins, amount));

    }

    @Test
    void testDP() {
        Solution solution = new Solution();
        int[] coins = {1,2,5};
        var amount = 11;

        assertEquals(3, solution.coinChangeDP(coins, amount));
    }

    @Test
    void testDP2() {
        Solution solution = new Solution();
        int[] coins = {2};
        var amount = 3;

        assertEquals(-1, solution.coinChangeDP(coins, amount));
    }


    @Test
    void testDP3() {
        Solution solution = new Solution();
        int[] coins = {1};
        var amount = 0;

        assertEquals(0, solution.coinChangeDP(coins, amount));
    }
}