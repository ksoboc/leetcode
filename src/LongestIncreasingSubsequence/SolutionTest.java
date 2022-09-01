package LongestIncreasingSubsequence;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    private Solution solution;

    @BeforeEach
    void prepare() {
        solution = new Solution();
    }

    @Test
    void test() {
        assertEquals(4, solution.lengthOfLIS(new int[]{10,9,2,5,3,7,101,18}));
        assertEquals(4, solution.lengthOfLIS(new int[]{0,1,0,3,2,3}));
        assertEquals(1, solution.lengthOfLIS(new int[]{7,7,7,7,7,7,7}));
        //[1,3,6,7,9,4,10,5,6]
        assertEquals(6, solution.lengthOfLIS(new int[]{1,3,6,7,9,4,10,5,6}));
    }

}