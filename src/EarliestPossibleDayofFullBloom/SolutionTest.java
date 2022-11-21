package EarliestPossibleDayofFullBloom;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void test1() {
        Solution solution=new Solution();

        var res = solution.earliestFullBloom(new int[]{1,4,3},new int[]{2,3,1});

        assertEquals(9,res);
    }
    @Test
    void test2() {
        Solution solution=new Solution();

        var res = solution.earliestFullBloom(new int[]{1,2,3,2},new int[]{2,1,2,1});

        assertEquals(9,res);
    }
    @Test
    void test3() {
        Solution solution=new Solution();

        var res = solution.earliestFullBloom(new int[]{1},new int[]{1});

        assertEquals(2,res);
    }

}