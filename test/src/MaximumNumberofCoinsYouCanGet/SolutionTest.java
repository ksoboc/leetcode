package MaximumNumberofCoinsYouCanGet;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void test1() {
        Solution solution=new Solution();
        int[] piles={2,4,1,2,7,8};
        var res=solution.maxCoins(piles);
        assertEquals(9,res);
    }
    @Test
    void test2() {
        Solution solution=new Solution();
        int[] piles={2,4,5};
        var res=solution.maxCoins(piles);
        assertEquals(4,res);
    }
    @Test
    void test3() {
        Solution solution=new Solution();
        int[] piles={9,8,7,6,5,1,2,3,4};
        var res=solution.maxCoins(piles);
        assertEquals(18,res);
    }

}