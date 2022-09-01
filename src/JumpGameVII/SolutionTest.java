package JumpGameVII;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    private Solution solution=new Solution();

    @Test
    void test() {
        var res = solution.canReach("011010",2,3);
        assertTrue(res);
    }

    @Test
    void test2() {
        var res = solution.canReach("01101110",2,3);
        assertFalse(res);
    }

    @Test
    void test3() {
        var res = solution.canReach("011011",2,3);
        assertFalse(res);
    }

    @Test
    void test4() {
        var res = solution.canReach("00",1,3);
        assertTrue(res);
    }

}