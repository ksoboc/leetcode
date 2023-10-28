package countVowelPermutation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void test1() {
        Solution solution=new Solution();
        var res = solution.countVowelPermutation(1);
        assertEquals(5,res);
    }
    @Test
    void test2() {
        Solution solution=new Solution();
        var res = solution.countVowelPermutation(2);
        assertEquals(10,res);
    }
    @Test
    void test3() {
        Solution solution=new Solution();
        var res = solution.countVowelPermutation(5);
        assertEquals(68,res);
    }

}