package UniquePaths;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void test1() {
        Solution2 solution=new Solution2();
        var res=solution.uniquePaths(3,7);
        assertEquals(28,res);
    }
    @Test
    void test2() {
        Solution2 solution=new Solution2();
        var res=solution.uniquePaths(3,2);
        assertEquals(3,res);
    }

}