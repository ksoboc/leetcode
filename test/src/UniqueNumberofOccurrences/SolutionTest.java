package UniqueNumberofOccurrences;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void test1() {
        Solution solution=new Solution();
        assertTrue(solution.uniqueOccurrences(new int[]{1,2,2,1,1,3}));
    }
    @Test
    void test2() {
        Solution solution=new Solution();
        assertFalse(solution.uniqueOccurrences(new int[]{1,2}));
    }
    @Test
    void test3() {
        Solution solution=new Solution();
        assertTrue(solution.uniqueOccurrences(new int[]{-3,0,1,-3,1,1,1,-3,10,0}));
    }

}