package DetectCapital;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void test1() {
        Solution solution=new Solution();
        assertTrue(solution.detectCapitalUse("USA"));
    }
    @Test
    void test2() {
        Solution solution=new Solution();
        assertFalse(solution.detectCapitalUse("FlaG"));
    }

}