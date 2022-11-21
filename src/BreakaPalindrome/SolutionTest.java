package BreakaPalindrome;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void test1() {
        Solution solution=new Solution();

        var res=solution.breakPalindrome("abccba");
        System.out.println("res = " + res);
        assertEquals("aaccba",res);
    }
    @Test
    void test2() {
        Solution solution=new Solution();

        var res=solution.breakPalindrome("a");
        System.out.println("res = " + res);
        assertEquals("",res);
    }

}