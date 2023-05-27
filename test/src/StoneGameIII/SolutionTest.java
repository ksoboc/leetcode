package StoneGameIII;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void test1() {
        Solution solution=new Solution();
        var res = solution.stoneGameIII(new int[]{1,2,3,7});
        assertEquals("Bob", res);
    }
    @Test
    void test2() {
        Solution solution=new Solution();
        var res = solution.stoneGameIII(new int[]{1,2,3,-9});
        assertEquals("Alice", res);
    }
    @Test
    void test3() {
        Solution solution=new Solution();
        var res = solution.stoneGameIII(new int[]{1,2,3,6});
        assertEquals("Tie", res);
    }

}