package BestTimetoBuyandSellStockwithCooldown;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    private Solution solution = new Solution();

    @Test
    void test() {
        assertEquals(3,solution.maxProfit(new int[]{1,2,3,0,2}));
    }

    @Test
    void testDP() {
        assertEquals(3,solution.maxProfitDP(new int[]{1,2,3,0,2}));
    }

    @Test
    void test2() {
        var res = solution.maxProfit(new int[]{48,12,60,93,97,42,25,64,17,56,85,93,9,48,52,42,58,85,81,84,69,36,1,54,23,15,72,15,11,94});
        System.out.println("res = " + res);
    }
    @Test
    void test2DP() {
        var res = solution.maxProfitDP(new int[]{48,12,60,93,97,42,25,64,17,56,85,93,9,48,52,42,58,85,81,84,69,36,1,54,23,15,72,15,11,94});
        System.out.println("res = " + res);
    }

}