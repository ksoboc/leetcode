package MinimumNumberofDaystoEatNOranges;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    private Solution solution=new Solution();

    @Test
    void test() {
        assertEquals(4,solution.minDays(10));
    }

    @Test
    void test2() {
        assertEquals(3,solution.minDays(6));
    }

}