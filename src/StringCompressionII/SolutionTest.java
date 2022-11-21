package StringCompressionII;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void test1() {
        Solution solution=new Solution();
        assertEquals(4, solution.getLengthOfOptimalCompression("aaabcccd",2));
    }
    @Test
    void test2() {
        Solution solution=new Solution();
        assertEquals(2, solution.getLengthOfOptimalCompression("aabbaa",2));
    }
    @Test
    void test3() {
        Solution solution=new Solution();
        assertEquals(3, solution.getLengthOfOptimalCompression("aaaaaaaaaaa",0));
    }
    @Test
    void test4() {
        Solution solution=new Solution();
        assertEquals(1, solution.getLengthOfOptimalCompression("abc",2));
    }
    @Test
    void test5() {
        Solution solution=new Solution();
        assertEquals(3, solution.getLengthOfOptimalCompression("abbbbbbbbbba",2));
    }
    @Test
    void test6() {
        Solution solution=new Solution();
        assertEquals(4, solution.getLengthOfOptimalCompression("llllllllllttttttttt",1));
    }
    @Test
    void test7() {
        Solution solution=new Solution();
        assertEquals(3, solution.getLengthOfOptimalCompression("bbabbbabbbbcbb",4));
    }

}