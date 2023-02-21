package FindtheTownJudge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void test1() {
        Solution solution=new Solution();
        assertEquals(2,solution.findJudge(2, new int[][]{{1,2}}));
    }
    @Test
    void test2() {
        Solution solution=new Solution();
        assertEquals(3,solution.findJudge(3, new int[][]{{1,3},{2,3}}));
    }
    @Test
    void test3() {
        Solution solution=new Solution();
        assertEquals(-1,solution.findJudge(3, new int[][]{{1,3},{2,3},{3,1}}));
    }

}