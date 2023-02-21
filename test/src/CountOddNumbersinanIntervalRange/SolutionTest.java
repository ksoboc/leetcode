package CountOddNumbersinanIntervalRange;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void test1() {
        Solution solution=new Solution();
        assertEquals(3, solution.countOdds(3,7));
    }

    @Test
    void test2() {
        Solution solution=new Solution();
        assertEquals(2, solution.countOdds(2,5));
    }
    @Test
    void test4() {
        Solution solution=new Solution();
        assertEquals(3, solution.countOdds(3,8));
    }
    @Test
    void test3() {
        Solution solution=new Solution();
        assertEquals(1, solution.countOdds(2,4));
    }
    @Test
    void test5() {
        Solution solution=new Solution();
        assertEquals(1, solution.countOdds(3,3));
    }
    @Test
    void test6() {
        Solution solution=new Solution();
        assertEquals(0, solution.countOdds(4,4));
    }

}