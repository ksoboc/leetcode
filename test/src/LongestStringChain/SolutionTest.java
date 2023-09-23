package LongestStringChain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void test1() {
        Solution solution=new Solution();
        var res = solution.longestStrChain(new String[]{"a","b","ba","bca","bda","bdca"});
        assertEquals(4,res);
    }
    @Test
    void test2() {
        Solution solution=new Solution();
        var res = solution.longestStrChain(new String[]{"xbc","pcxbcf","xb","cxbc","pcxbc"});
        assertEquals(5,res);
    }
    @Test
    void test3() {
        Solution solution=new Solution();
        var res = solution.longestStrChain(new String[]{"abcd","dbqca"});
        assertEquals(1,res);
    }

}