package NumberofSubsequencesThatSatisfytheGivenSumCondition;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    private Solution solution = new Solution();

    @Test
    void test() {
        assertEquals(4, solution.numSubseq(new int[]{3, 5, 6, 7}, 9));
    }

    @Test
    void test1() {
        assertEquals(6, solution.numSubseq(new int[]{3, 3, 6, 8}, 10));
    }

    @Test
    void test3() {
        // [14,4,6,6,20,8,5,6,8,12,6,10,14,9,17,16,9,7,14,11,14,15,13,11,10,18,13,17,17,14,17,7,9,5,10,13,8,5,18,20,7,5,5,15,19,14]
        //22
        assertEquals(272187084, solution.numSubseq(new int[]{14, 4, 6, 6, 20, 8, 5, 6, 8, 12, 6, 10, 14, 9, 17, 16, 9, 7, 14, 11, 14, 15, 13, 11, 10, 18, 13, 17, 17, 14, 17, 7, 9, 5, 10, 13, 8, 5, 18, 20, 7, 5, 5, 15, 19, 14}, 22));
    }

}