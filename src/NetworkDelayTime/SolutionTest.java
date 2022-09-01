package NetworkDelayTime;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    private Solution solution = new Solution();

    @Test
    void test1() {
        var res = solution.networkDelayTime(new int[][]{{2,1,1},{2,3,1},{3,4,1}},4,2);
        System.out.println("res = " + res);

        assertEquals(2,res);
    }
    @Test
    void test2() {
        var res = solution.networkDelayTime(new int[][]{{1,2,1}}, 2, 1);
        System.out.println("res = " + res);

        assertEquals(1,res);
    }
    @Test
    void test3() {
        var res = solution.networkDelayTime(new int[][]{{1,2,1}}, 2, 2);
        System.out.println("res = " + res);

        assertEquals(-1,res);
    }

    @Test
    void test4() {
        var res = solution.networkDelayTime(new int[][]{{1,2,1},{2,3,2},{1,3,2}}, 3, 1);
        System.out.println("res = " + res);

        assertEquals(3,res);
    }


}