package IsSubsequence;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void test1() {
        Solution solution=new Solution();
        assertTrue(solution.isSubsequence("abc","ahbgdc"));
    }
    @Test
    void test2() {
        Solution solution=new Solution();
        assertFalse(solution.isSubsequence("axc","ahbgdc"));
    }

}