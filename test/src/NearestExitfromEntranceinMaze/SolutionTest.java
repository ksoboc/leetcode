package NearestExitfromEntranceinMaze;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void test1() {
        Solution solution=new Solution();

        assertEquals(1,solution.nearestExit(new char[][]{{'+','+','.','+'},{'.','.','.','+'},{'+','+','+','.'}},new int[]{1,2}));
    }
    @Test
    void test2() {
        Solution solution=new Solution();

        assertEquals(2,solution.nearestExit(new char[][]{{'+','+','+'},{'.','.','.'},{'+','+','+'}},new int[]{1,0}));
    }
    @Test
    void test3() {
        Solution solution=new Solution();

        assertEquals(-1,solution.nearestExit(new char[][]{{'.','+'}},new int[]{0,0}));
    }
    @Test
    void test4() {
        Solution solution=new Solution();

        assertEquals(7,solution.nearestExit(new char[][]{{'+','.','+','+','+','+','+'},{'+','.','+','.','.','.','+'},{'+','.','+','.','+','.','+'},{'+','.','.','.','.','.','+'},{'+','+','+','+','.','+','.'}},new int[]{0,1}));
    }
}