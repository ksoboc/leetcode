package NumberofNodesintheSubTreeWiththeSameLabel;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void test1() {
        Solution solution=new Solution();
        assertArrayEquals(new int[]{2,1,1,1,1,1,1}, solution.countSubTrees(7, new int[][]{{0,1},{0,2},{1,4},{1,5},{2,3},{2,6}},"abaedcd"));
    }

}