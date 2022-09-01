package ReorganizeString;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void test() {
        Solution solution = new Solution();

        System.out.println("solution.reorganizeString(\"aab\") = " + solution.reorganizeString("aab"));
        assertEquals("aba",solution.reorganizeString("aab"));
    }

    @Test
    void test2() {
        Solution solution = new Solution();

        System.out.println("solution.reorganizeString(\"aaab\") = " + solution.reorganizeString("aaab"));
        assertEquals("",solution.reorganizeString("aaab"));
    }

}