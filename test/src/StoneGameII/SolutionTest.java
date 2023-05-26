package StoneGameII;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void test1() {
        Solution solution=new Solution();
        assertEquals(10, solution.stoneGameII(new int[]{2,7,9,4,4}));
    }
    @Test
    void test2() {
        Solution solution=new Solution();
        assertEquals(104, solution.stoneGameII(new int[]{1,2,3,4,5,100}));
    }

}