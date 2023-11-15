package MaximumElementAfterDecreasingandRearranging;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionNSTest {
    @Test
    void test1() {
        SolutionNoSorting solution=new SolutionNoSorting();
        var res = solution.maximumElementAfterDecrementingAndRearranging(new int[]{2,2,1,2,1});
        assertEquals(2,res);
    }
    @Test
    void test2() {
        SolutionNoSorting solution=new SolutionNoSorting();
        var res = solution.maximumElementAfterDecrementingAndRearranging(new int[]{100,1,1000});
        assertEquals(3,res);
    }

}