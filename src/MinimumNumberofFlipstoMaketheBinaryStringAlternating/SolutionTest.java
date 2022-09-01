package MinimumNumberofFlipstoMaketheBinaryStringAlternating;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    private Solution solution=new Solution();

    @Test
    void test() {
        assertEquals(2, solution.minFlips("111000"));
    }

    @Test
    void test2() {
        assertEquals(0, solution.minFlips("010"));
    }

    @Test
    void test3() {
        assertEquals(1, solution.minFlips("1110"));
    }

}