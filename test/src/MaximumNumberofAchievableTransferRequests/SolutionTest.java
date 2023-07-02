package MaximumNumberofAchievableTransferRequests;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void test1() {
        Solution solution=new Solution();
        var res = solution.maximumRequests(5, new int[][]{{0,1},{1,0},{0,1},{1,2},{2,0},{3,4}});

        assertEquals(5,res);
    }
    @Test
    void test2() {
        Solution solution=new Solution();
        var res = solution.maximumRequests(3, new int[][]{{0,0},{1,2},{2,1}});

        assertEquals(3,res);
    }
    @Test
    void test3() {
        Solution solution=new Solution();
        var res = solution.maximumRequests(4, new int[][]{{0,3},{3,1},{1,2},{2,0}});

        assertEquals(4,res);
    }

}