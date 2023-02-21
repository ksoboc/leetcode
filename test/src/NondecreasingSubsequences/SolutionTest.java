package NondecreasingSubsequences;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void test1() {
        Solution solution = new Solution();
        var res = solution.findSubsequences(new int[]{4, 6, 7, 7});
        System.out.println("res = " + res);
        assertEquals(8,res.size());
    }
    @Test
    void test2() {
        Solution solution = new Solution();
        var res = solution.findSubsequences(new int[]{4,4,3,2,1});
        System.out.println("res = " + res);
        assertEquals(1,res.size());
    }

}