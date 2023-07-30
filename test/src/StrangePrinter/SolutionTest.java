package StrangePrinter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void test1() {
        Solution solution=new Solution();
        var res =solution.strangePrinter("aaabbb");
        assertEquals(2,res);
    }

    @Test
    void test2() {
        Solution solution=new Solution();
        var res =solution.strangePrinter("aba");
        assertEquals(2,res);
    }

    @Test
    void test3() {
        Solution solution=new Solution();
        var res =solution.strangePrinter("tbgtgb");
        assertEquals(4,res);
    }
    @Test
    void test4() {
        Solution solution=new Solution();
        var res =solution.strangePrinter("leetcode");
        assertEquals(6,res);
    }


}