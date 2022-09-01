package CombinationSumII;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    private Solution solution=new Solution();

    @Test
    void test() {
        var res = solution.combinationSum2(new int[]{10,1,2,7,6,1,5},8);
        System.out.println("res = " + res);
        assertEquals(4,res.size());
    }

    @Test
    void test2() {
        var res = solution.combinationSum2(new int[]{2,5,2,1,2},5);
        System.out.println("res = " + res);
        assertEquals(2,res.size());
    }

}