package MaxDotProductofTwoSubsequences;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionDPTest {
    @Test
    void test1() {
        SolutionDP solution=new SolutionDP();
        int[] nums1={2,1,-2,5};
        int[] nums2={3,0,-6};
        var res=solution.maxDotProduct(nums1,nums2);
        assertEquals(18,res);
    }
    @Test
    void test2() {
        SolutionDP solution=new SolutionDP();
        int[] nums1={3,-2};
        int[] nums2={2,-6,7};
        var res=solution.maxDotProduct(nums1,nums2);
        assertEquals(21,res);
    }
    @Test
    void test3() {
        SolutionDP solution=new SolutionDP();
        int[] nums1={-1,-1};
        int[] nums2={1,1};
        var res=solution.maxDotProduct(nums1,nums2);
        assertEquals(-1,res);
    }

}