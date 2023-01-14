package LongestSubsequencewithLimitedSum;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void test1() {
        Solution solution=new Solution();

        var res = solution.answerQueries(new int[]{4,5,2,1}, new int[]{3,10,21});
        assertArrayEquals(new int[]{2,3,4}, res);
    }
    @Test
    void test2() {
        Solution solution=new Solution();

        var res = solution.answerQueries(new int[]{2,3,4,5}, new int[]{1});
        assertArrayEquals(new int[]{0}, res);
    }

}