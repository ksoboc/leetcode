package MinimumRoundstoCompleteAllTasks;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void test1() {
        Solution solution=new Solution();

        assertEquals(4,solution.minimumRounds(new int[]{2,2,3,3,2,4,4,4,4,4}));
    }
    @Test
    void test2() {
        Solution solution=new Solution();

        assertEquals(-1,solution.minimumRounds(new int[]{2,3,3}));
    }

}