package CountPrimes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void test() {
        Solution solution=new Solution();
        assertEquals(4,solution.countPrimes(10));
    }
    @Test
    void test2() {
        Solution solution=new Solution();
        assertEquals(0,solution.countPrimes(0));
    }
    @Test
    void test3() {
        Solution solution=new Solution();
        assertEquals(0,solution.countPrimes(1));
    }

}