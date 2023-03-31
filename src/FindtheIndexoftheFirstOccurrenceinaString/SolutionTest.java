package FindtheIndexoftheFirstOccurrenceinaString;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void test1() {
        Solution solution=new Solution();
        assertEquals(0, solution.strStr("sadbysad", "sad"));
    }
    @Test
    void test2() {
        Solution solution=new Solution();
        assertEquals(-1, solution.strStr("leetcode", "leeto"));
    }
    @Test
    void test3() {
        Solution solution=new Solution();
        assertEquals(2, solution.strStr("hello", "ll"));
    }
    @Test
    void test4() {
        Solution solution=new Solution();
        assertEquals(0, solution.strStr("a", "a"));
    }
    @Test
    void test5() {
        Solution solution=new Solution();
        //assertEquals(107, solution.strStr("baabbaaaaaaabbaaaaabbabbababaabbabbbbbabbabbbbbbabababaabbbbbaaabbbbabaababababbbaabbbbaaabbaababbbaabaabbabbaaaabababaaabbabbababbabbaaabbbbabbbbabbabbaabbbaa", "bbaaaababa"));
        assertEquals(1, solution.strStr("abbaaaababa", "bbaaaababa"));
    }

}