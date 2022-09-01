package NumberofMatchingSubsequences;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    private Solution solution = new Solution();

    @Test
    void test() {
        assertEquals(3, solution.numMatchingSubseq("abcde", new String[]{"a","bb","acd","ace"}));
    }

    @Test
    void test2() {
        assertEquals(3, solution.numMatchingSubseq2("abcde", new String[]{"a","bb","acd","ace"}));
    }

}