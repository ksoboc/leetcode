package PermutationinString;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    private Solution solution=new Solution();
    @Test
    void test() {
        assertTrue(solution.checkInclusion("ab","eidbaooo"));
    }

    @Test
    void test1() {
        assertFalse(solution.checkInclusion("ab", "eidboaoo"));
    }
}