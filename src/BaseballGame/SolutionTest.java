package BaseballGame;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution = new Solution();
    @Test
    void test()  {
        String[] ops = {"5","2","C","D","+"};
        assertEquals(30, solution.calPoints(ops));
    }


}