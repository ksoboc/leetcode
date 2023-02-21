package WordSearch;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void test1() {
        Solution solution=new Solution();

        var res=solution.exist(new char[][]{{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}},"ABCCED");
        assertTrue(res);
    }
    @Test
    void test2() {
        Solution solution=new Solution();

        var res=solution.exist(new char[][]{{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}},"SEE");
        assertTrue(res);
    }
    @Test
    void test3() {
        Solution solution=new Solution();

        var res=solution.exist(new char[][]{{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}},"ABCB");
        assertFalse(res);
    }

}