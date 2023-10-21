package ConstrainedSubsequenceSum;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionMQTest {
    @Test
    void test1() {
        int[] nums = {10,2,-10,5,20};
        SolutionMonotonicQueue solution=new SolutionMonotonicQueue();
        var res=solution.constrainedSubsetSum(nums,2);
        assertEquals(37,res);
    }
    @Test
    void test2() {
        int[] nums = {-1,-2,-3};
        SolutionMonotonicQueue solution=new SolutionMonotonicQueue();
        var res=solution.constrainedSubsetSum(nums,1);
        assertEquals(-1,res);
    }
    @Test
    void test3() {
        int[] nums = {10,-2,-10,-5,20};
        SolutionMonotonicQueue solution=new SolutionMonotonicQueue();
        var res=solution.constrainedSubsetSum(nums,2);
        assertEquals(23,res);
    }

    //
    @Test
    void test4() {
        int[] nums = {-5266,4019,7336,-3681,-5767};
        SolutionMonotonicQueue solution=new SolutionMonotonicQueue();
        var res=solution.constrainedSubsetSum(nums,2);
        assertEquals(11355,res);
    }
}