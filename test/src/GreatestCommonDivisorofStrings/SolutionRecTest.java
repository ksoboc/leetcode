package GreatestCommonDivisorofStrings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionRecTest {
    @Test
    void test1() {
        SolutionRec solution=new SolutionRec();
        assertEquals("ABC", solution.gcdOfStrings("ABCABC", "ABC"));
    }
    @Test
    void test2() {
        SolutionRec solution=new SolutionRec();
        assertEquals("AB", solution.gcdOfStrings("ABABAB", "ABAB"));
    }
    @Test
    void test3() {
        SolutionRec solution=new SolutionRec();
        assertEquals("", solution.gcdOfStrings("LEET", "CODE"));
    }
    @Test
    void test4() {
        SolutionRec solution=new SolutionRec();
        assertEquals("ABAB", solution.gcdOfStrings("ABAB", "ABABABAB"));
    }

}