package MinimumFlipstoMakeaORbEqualtoc;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void test1() {
        Solution solution=new Solution();
        assertEquals(3,solution.minFlips(2,6,5));
    }
    @Test
    void test2() {
        Solution solution=new Solution();
        assertEquals(1,solution.minFlips(4,2,7));
    }
    @Test
    void test3() {
        Solution solution=new Solution();
        assertEquals(0,solution.minFlips(1,2,3));
    }

}