package UniquePaths;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void test1() {
        Solution solution=new Solution();

        assertEquals(28, solution.uniquePaths(3,7));
    }

    @Test
    void test2() {
        Solution solution=new Solution();

        assertEquals(3, solution.uniquePaths(3,2));
    }
    @Test
    void test1dp() {
        Solution solution=new Solution();

        assertEquals(28, solution.uniquePathsDP(3,7));
    }

    @Test
    void test2dp() {
        Solution solution=new Solution();

        assertEquals(3, solution.uniquePathsDP(3,2));
    }
}