package LongestArithmeticSubsequenceofGivenDifference;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void test1() {
        Solution solution=new Solution();
        var res=solution.longestSubsequence(new int[]{1,2,3,4},1);
        assertEquals(4,res);
    }
    @Test
    void test2() {
        Solution solution=new Solution();
        var res=solution.longestSubsequence(new int[]{1,3,5,7},1);
        assertEquals(1,res);
    }
    @Test
    void test3() {
        Solution solution=new Solution();
        var res=solution.longestSubsequence(new int[]{1,5,7,8,5,3,4,2,1},-2);
        assertEquals(4,res);
    }

}