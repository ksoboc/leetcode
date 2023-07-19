package FindPlayersWithZeroorOneLosses;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void test1() {
        Solution solution=new Solution();
        var res = solution.findWinners(new int[][]{{1,3},{2,3},{3,6},{5,6},{5,7},{4,5},{4,8},{4,9},{10,4},{10,9}});
        System.out.println("res = " + res);
    }
    @Test
    void test2() {
        Solution solution=new Solution();
        var res = solution.findWinners(new int[][]{{2,3},{1,3},{5,4},{6,4}});
        System.out.println("res = " + res);
    }

}