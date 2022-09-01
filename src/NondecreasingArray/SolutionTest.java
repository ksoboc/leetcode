package NondecreasingArray;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    private Solution solution=new Solution();

    @Test
    void test() {
        assertTrue(solution.checkPossibility(new int[]{4,2,3}));
    }
    @Test
    void test2() {
        assertFalse(solution.checkPossibility(new int[]{4,2,1}));
    }
    //[-1,4,2,3]
    @Test
    void test3() {
        assertTrue(solution.checkPossibility(new int[]{-1,4,2,3}));
    }
}