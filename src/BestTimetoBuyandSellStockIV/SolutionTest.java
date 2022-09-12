package BestTimetoBuyandSellStockIV;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void test1() {
        Solution solution=new Solution();
        assertEquals(2,solution.maxProfit(2,new int[]{2,4,1}));
    }
    @Test
    void test2() {
        Solution solution=new Solution();
        assertEquals(7,solution.maxProfit(2,new int[]{3,2,6,5,0,3}));
    }

}