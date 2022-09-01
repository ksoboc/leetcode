package JumpGameII;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    private Solution solution=new Solution();

    @Test
    void test() {
        assertEquals(2, solution.jump(new int[]{2,3,1,1,4}));
    }

    @Test
    void test2() {
        assertEquals(2,solution.jump(new int[]{2,3,0,1,4}));
    }

    @Test
    void test3() {
        assertEquals(2, solution.jumpDP(new int[]{2,3,1,1,4}));
    }

}