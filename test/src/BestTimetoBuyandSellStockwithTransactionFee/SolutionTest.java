package BestTimetoBuyandSellStockwithTransactionFee;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void test1() {
        Solution solution=new Solution();
        assertEquals(8, solution.maxProfit(new int[]{1,3,2,8,4,9}, 2));
    }
    @Test
    void test2() {
        Solution solution=new Solution();
        assertEquals(6, solution.maxProfit(new int[]{1,3,7,5,10,3}, 3));
    }

}