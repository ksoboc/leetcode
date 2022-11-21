package SatisfiabilityofEqualityEquations;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void test1() {
        Solution solution=new Solution();
        var res = solution.equationsPossible(new String[]{"a==b","b!=a"});
        assertFalse(res);
    }
    @Test
    void test2() {
        Solution solution=new Solution();
        var res = solution.equationsPossible(new String[]{"a==b","b==a"});
        assertTrue(res);
    }

}