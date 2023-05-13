package CountWaysToBuildGoodStrings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void test1() {
        Solution solution=new Solution();
        assertEquals(8, solution.countGoodStrings(3,3,1,1));
    }

    @Test
    void test2() {
        Solution solution=new Solution();
        assertEquals(5, solution.countGoodStrings(2,3,1,2));
    }

}