package BestTimetoBuyandSellStockwithTransactionFee;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionIterTest {
    @Test
    void test1() {
        SolutionIter solution=new SolutionIter();
        assertEquals(8, solution.maxProfit(new int[]{1,3,2,8,4,9}, 2));
    }
    @Test
    void test2() {
        SolutionIter solution=new SolutionIter();
        assertEquals(6, solution.maxProfit(new int[]{1,3,7,5,10,3}, 3));
    }

}