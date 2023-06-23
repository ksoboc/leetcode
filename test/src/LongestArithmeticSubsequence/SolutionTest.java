package LongestArithmeticSubsequence;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void test1() {
        Solution solution=new Solution();

        assertEquals(4, solution.longestArithSeqLength(new int[]{3,6,9,12}));
    }

    @Test
    void test2() {
        Solution solution=new Solution();

        assertEquals(3, solution.longestArithSeqLength(new int[]{9,4,7,2,10}));
    }

    @Test
    void test3() {
        Solution solution=new Solution();

        assertEquals(4, solution.longestArithSeqLength(new int[]{20,1,15,3,10,5,8}));
    }
    @Test
    void test4() {
        Solution solution=new Solution();

        assertEquals(6, solution.longestArithSeqLength(new int[]{22,8,57,41,36,46,42,28,42,14,9,43,27,51,0,0,38,50,31,60,29,31,20,23,37,53,27,1,47,42,28,31,10,35,39,12,15,6,35,31,45,21,30,19,5,5,4,18,38,51,10,7,20,38,28,53,15,55,60,56,43,48,34,53,54,55,14,9,56,52}));
    }

}