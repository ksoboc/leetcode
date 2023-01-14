package LexicographicallySmallestEquivalentString;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void test1() {
        Solution solution=new Solution();

        assertEquals("makkek", solution.smallestEquivalentString("parker","morris","parser"));
    }

    @Test
    void test2() {
        Solution solution=new Solution();

        assertEquals("hdld", solution.smallestEquivalentString("hello","world","hold"));
    }
    @Test
    void test3() {
        Solution solution=new Solution();

        assertEquals("aauaaaaada", solution.smallestEquivalentString("leetcode","programs","sourcecode"));
    }

}