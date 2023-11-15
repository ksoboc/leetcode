package MaximumElementAfterDecreasingandRearranging;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void test1() {
        Solution solution=new Solution();
        var res = solution.maximumElementAfterDecrementingAndRearranging(new int[]{2,2,1,2,1});
        assertEquals(2,res);
    }
    @Test
    void test2() {
        Solution solution=new Solution();
        var res = solution.maximumElementAfterDecrementingAndRearranging(new int[]{100,1,1000});
        assertEquals(3,res);
    }

}