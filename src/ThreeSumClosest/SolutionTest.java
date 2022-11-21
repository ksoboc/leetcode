package ThreeSumClosest;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void test1() {
        Solution solution=new Solution();

        var res = solution.threeSumClosest(new int[]{-1,2,1,-4},1);
        assertEquals(2,res);
    }
    @Test
    void test2() {
        Solution solution=new Solution();

        var res = solution.threeSumClosest(new int[]{0,0,0},1);
        assertEquals(0,res);
    }

}