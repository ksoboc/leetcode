package RemoveDuplicateLetters;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void test1() {
        Solution solution=new Solution();
        var res = solution.removeDuplicateLetters("bcabc");
        System.out.println("res = " + res);
        assertEquals("abc",res);
    }
    @Test
    void test2() {
        Solution solution=new Solution();
        var res = solution.removeDuplicateLetters("cbacdcbc");
        System.out.println("res = " + res);
        assertEquals("acdb",res);
    }

}