package StoneGame;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    private Solution solution = new Solution();

    @Test
    void test() {
        var res = solution.stoneGame(new int[]{5,3,4,5});
        assertTrue(res);
    }

    @Test
    void test2() {
        var res = solution.stoneGame(new int[]{3,7,2,3});
        assertTrue(res);
    }

}