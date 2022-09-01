package WiggleSubsequence;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    private Solution solution=new Solution();

    @Test
    void test() {
        assertEquals(6,solution.wiggleMaxLength(new int[]{1,7,4,9,2,5}));
    }

}