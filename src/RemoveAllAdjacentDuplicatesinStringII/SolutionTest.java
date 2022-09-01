package RemoveAllAdjacentDuplicatesinStringII;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    private Solution solution = new Solution();

    @Test
    void test1() {
        var res = solution.removeDuplicates("abcd", 2);
        assertEquals("abcd", res);
    }

    @Test
    void test2() {
        var res = solution.removeDuplicates("deeedbbcccbdaa", 3);
        assertEquals("aa", res);
    }


}