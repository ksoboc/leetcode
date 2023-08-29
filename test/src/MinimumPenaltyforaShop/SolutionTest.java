package MinimumPenaltyforaShop;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void test1() {
        Solution solution=new Solution();
        var res = solution.bestClosingTime("YYNY");
        assertEquals(2,res);
    }
    @Test
    void test2() {
        Solution solution=new Solution();
        var res = solution.bestClosingTime("NNNNN");
        assertEquals(0,res);
    }
    @Test
    void test3() {
        Solution solution=new Solution();
        var res = solution.bestClosingTime("YYYY");
        assertEquals(4,res);
    }

}