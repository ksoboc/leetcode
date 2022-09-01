package OutofBoundaryPaths;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void test1() {
        Solution solution=new Solution();

        assertEquals(6,solution.findPaths(2,2,2,0,0));
    }

    @Test
    void test2() {
        Solution solution=new Solution();

        assertEquals(12,solution.findPaths(1,3,3,0,1));
    }

    @Test
    void test3() {
        Solution solution=new Solution();

        assertEquals(1104,solution.findPaths(2,3,8,1,0));
    }
}