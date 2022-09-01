package IsomorphicStrings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    private Solution solution=new Solution();

    @Test
    void test() {
        assertTrue(solution.isIsomorphic("egg","add"));
        assertFalse(solution.isIsomorphic("foo","bar"));
        assertTrue(solution.isIsomorphic("paper","title"));
    }

}