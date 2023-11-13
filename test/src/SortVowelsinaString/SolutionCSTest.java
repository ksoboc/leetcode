package SortVowelsinaString;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionCSTest {
    @Test
    void test1() {
        SolutionCS solution=new SolutionCS();
        var res=solution.sortVowels("lEetcOde");
        assertEquals("lEOtcede",res);
    }
    @Test
    void test2() {
        SolutionCS solution=new SolutionCS();
        var res=solution.sortVowels("lYmpH");
        assertEquals("lYmpH",res);
    }

}