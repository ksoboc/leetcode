package DecodeString;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    private Solution solution = new Solution();

    @Test
    void test() {
        assertEquals("aaabcbc", solution.decodeString("3[a]2[bc]"));
    }

    @Test
    void test2() {
        assertEquals("accaccacc", solution.decodeString("3[a2[c]]"));
    }

    @Test
    void test3() {
        assertEquals("abcabccdcdcdef", solution.decodeString("2[abc]3[cd]ef"));
    }

}