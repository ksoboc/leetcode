package DominoandTrominoTiling;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void test1() {
        Solution solution=new Solution();

        assertEquals(5, solution.numTilings(3));
    }
    @Test
    void test2() {
        Solution solution=new Solution();

        assertEquals(1, solution.numTilings(1));
    }

}