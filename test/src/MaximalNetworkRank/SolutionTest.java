package MaximalNetworkRank;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void test1() {
        Solution solution=new Solution();
        int[][] roads = {{0,1},{0,3},{1,2},{1,3}};
        var res = solution.maximalNetworkRank(4,roads);
        System.out.println("res = " + res);
        assertEquals(4,res);
    }
    @Test
    void test2() {
        Solution solution=new Solution();
        int[][] roads = {{0,1},{0,3},{1,2},{1,3},{2,3},{2,4}};
        var res = solution.maximalNetworkRank(5,roads);
        System.out.println("res = " + res);
        assertEquals(5,res);
    }
    @Test
    void test3() {
        Solution solution=new Solution();
        int[][] roads = {{0,1},{1,2},{2,3},{2,4},{5,6},{5,7}};
        var res = solution.maximalNetworkRank(8,roads);
        System.out.println("res = " + res);
        assertEquals(5,res);
    }

}