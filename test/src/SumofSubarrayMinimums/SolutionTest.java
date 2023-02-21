package SumofSubarrayMinimums;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void test1() {
        Solution solution=new Solution();

        assertEquals(17,solution.sumSubarrayMins(new int[]{3,1,2,4}));
    }
    @Test
    void test2() {
        Solution solution=new Solution();

        assertEquals(444,solution.sumSubarrayMins(new int[]{11,81,94,43,3}));
    }

}