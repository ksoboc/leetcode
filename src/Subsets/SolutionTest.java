package Subsets;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    private Solution solution=new Solution();

    @Test
    void test() {
        var res = solution.subsets(new int[]{1,2,3});
        System.out.println("res = " + res);
        assertEquals(8, res.size());
    }

    @Test
    void testBT() {
        var res = solution.subsetsBT(new int[]{1,2,3});
        System.out.println("res = " + res);
        assertEquals(8, res.size());
    }

}