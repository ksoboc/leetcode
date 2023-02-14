package ShortestPathwithAlternatingColors;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void test1() {
        Solution solution=new Solution();
        assertArrayEquals(new int[]{0,1,-1}, solution.shortestAlternatingPaths(3, new int[][]{{0,1},{1,2}}, new int[][]{}));
    }
    @Test
    void test2() {
        Solution solution=new Solution();
        assertArrayEquals(new int[]{0,1,-1}, solution.shortestAlternatingPaths(3, new int[][]{{0,1}}, new int[][]{{2,1}}));
    }
    @Test
    void test3() {
        Solution solution=new Solution();
        assertArrayEquals(new int[]{0,1,-1}, solution.shortestAlternatingPaths(3, new int[][]{{0,1},{1,2}}, new int[][]{{1,0}}));
    }
    //
    @Test
    void test4() {
        Solution solution=new Solution();
        assertArrayEquals(new int[]{0,-1,1,1,3,1,1,2}, solution.shortestAlternatingPaths(8, new int[][]{{3,2},{0,3},{1,3},{3,6},{2,5},{5,0},{5,3},{5,6},{7,3}}, new int[][]{{2,4},{6,6},{3,2},{6,0},{4,4},{0,2},{2,5},{4,5},{5,0},{0,3},{5,6},{3,7},{3,5},{0,6},{7,0},{7,1},{1,0},{7,4},{0,5}}));
    }

}