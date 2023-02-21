package MinimumTimetoCollectAllApplesinaTree;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void test1() {
        Solution solution=new Solution();
        assertEquals(8, solution.minTime(7, new int[][]{{0,1},{0,2},{1,4},{1,5},{2,3},{2,6}}, List.of(false,false,true,false,true,true,false)));
    }
    @Test
    void test2() {
        Solution solution=new Solution();
        assertEquals(6, solution.minTime(7, new int[][]{{0,1},{0,2},{1,4},{1,5},{2,3},{2,6}}, List.of(false,false,true,false,false,true,false)));
    }

}