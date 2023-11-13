package SortVowelsinaString;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void test1() {
        Solution solution=new Solution();
        var res=solution.sortVowels("lEetcOde");
        assertEquals("lEOtcede",res);
    }
    @Test
    void test2() {
        Solution solution=new Solution();
        var res=solution.sortVowels("lYmpH");
        assertEquals("lYmpH",res);
    }

}