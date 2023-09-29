package MonotonicArray;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void test1() {
        Solution solution=new Solution();
        assertTrue(solution.isMonotonic(new int[]{1,2,2,3}));
    }
    @Test
    void test2() {
        Solution solution=new Solution();
        assertTrue(solution.isMonotonic(new int[]{6,5,4,4}));
    }
    @Test
    void test3() {
        Solution solution=new Solution();
        assertFalse(solution.isMonotonic(new int[]{1,3,2}));
    }

}