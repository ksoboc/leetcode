package FindtheDifferenceofTwoArrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void test1() {
        Solution solution=new Solution();
        var res = solution.findDifference(new int[]{1,2,3},new int[]{2,4,6});
        System.out.println("res = " + res);
        assertEquals(2, res.get(0).size());
        assertEquals(2, res.get(1).size());
    }
    @Test
    void test2() {
        Solution solution=new Solution();
        var res = solution.findDifference(new int[]{1,2,3,3},new int[]{1,1,2,2});
        System.out.println("res = " + res);
        assertEquals(1, res.get(0).size());
        assertEquals(0, res.get(1).size());
    }

}