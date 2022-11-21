package CheckiftheSentenceIsPangram;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void test() {
        Solution solution=new Solution();
        assertTrue(solution.checkIfPangram("thequickbrownfoxjumpsoverthelazydog"));
    }
    @Test
    void test2() {
        Solution solution=new Solution();
        assertFalse(solution.checkIfPangram("leetcode"));
    }

}