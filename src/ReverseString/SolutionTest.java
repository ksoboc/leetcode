package ReverseString;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    private Solution solution = new Solution();
    @Test
    void test() {
        char [] s = new char[]{'h','e','l','l','o'};
        solution.reverseString(s);

        assertArrayEquals(new char[]{'o','l','l','e','h'}, s);
    }

}