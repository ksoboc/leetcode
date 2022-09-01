package WordSearch;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    private Solution solution = new Solution();


    @Test
    void test() {
        var res = solution.exist(new char[][]{{'A', 'B', 'C', 'E'}, {'S', 'F', 'C', 'S'}, {'A', 'D', 'E', 'E'}}
                , "ABCCED");
        assertTrue(res);
    }

    @Test
    void test2() {
        var res = solution.exist(new char[][]{{'A', 'B', 'C', 'E'}, {'S', 'F', 'C', 'S'}, {'A', 'D', 'E', 'E'}}
                , "SEE");
        assertTrue(res);
    }

    @Test
    void test3() {
        var res = solution.exist(new char[][]{{'A', 'B', 'C', 'E'}, {'S', 'F', 'C', 'S'}, {'A', 'D', 'E', 'E'}}
                , "ABCB");
        assertFalse(res);
    }

}