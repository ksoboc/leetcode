package NumberofGoodPaths;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void test1() {
        Solution solution=new Solution();

        assertEquals(7, solution.numberOfGoodPaths(new int[]{1,1,2,2,3},new int[][]{{0,1},{1,2},{2,3},{2,4}}));
    }

}