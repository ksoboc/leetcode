package BattleshipInaBoard;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    @Test
    void test1() {
        Solution solution=new Solution();
        assertEquals(2, solution.countBattleships(new char[][]{{'X','.','.','X'},{'.','.','.','X'},{'.','.','.','X'}}));
    }
    @Test
    void test2() {
        Solution solution=new Solution();
        assertEquals(0, solution.countBattleships(new char[][]{{'.'}}));
    }

}