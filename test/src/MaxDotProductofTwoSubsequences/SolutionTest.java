package MaxDotProductofTwoSubsequences;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void test1() {
        Solution solution=new Solution();
        int[] nums1={2,1,-2,5};
        int[] nums2={3,0,-6};
        var res=solution.maxDotProduct(nums1,nums2);
        assertEquals(18,res);
    }
    @Test
    void test2() {
        Solution solution=new Solution();
        int[] nums1={3,-2};
        int[] nums2={2,-6,7};
        var res=solution.maxDotProduct(nums1,nums2);
        assertEquals(21,res);
    }
    @Test
    void test3() {
        Solution solution=new Solution();
        int[] nums1={-1,-1};
        int[] nums2={1,1};
        var res=solution.maxDotProduct(nums1,nums2);
        assertEquals(-1,res);
    }
    @Test
    void test4() {
        Solution solution=new Solution();
        int[] nums1={5,-4,-3};
        int[] nums2={-4,-3,0,-4,2};
        var res=solution.maxDotProduct(nums1,nums2);
        assertEquals(28,res);
    }
    @Test
    void test5() {
        Solution solution=new Solution();
        int[] nums1={0,4,-6,8,10,3,7,15,-15,-1,-6,-13,2,-6,-9,9,-7,-6};
        int[] nums2={1,12,9,-7,2,9,-2,0,-10,-12,14,-15,-7,-9,4,15,-6,2};
        var res=solution.maxDotProduct(nums1,nums2);
        assertEquals(1056,res);
    }

}