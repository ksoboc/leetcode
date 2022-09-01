package JumpGame;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    private Solution solution=new Solution();

    @Test
    void testPossible() {
        assertTrue(solution.canJump(new int[]{2,3,1,1,4}));
    }

    @Test
    void testImpossible() {
        assertFalse(solution.canJump(new int[]{3,2,1,0,4}));
    }

}