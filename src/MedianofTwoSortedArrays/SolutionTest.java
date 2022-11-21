package MedianofTwoSortedArrays;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void test() {
        Solution solution=new Solution();

        int[] nums1={1,3};
        int[] nums2={2};

        var res = solution.findMedianSortedArrays(nums1,nums2);
        assertEquals(2.0,res, 0.01);
    }
    @Test
    void test2() {
        Solution solution=new Solution();

        int[] nums1={1,2};
        int[] nums2={3,4};

        var res = solution.findMedianSortedArrays(nums1,nums2);
        assertEquals(2.5,res, 0.01);
    }
    @Test
    void test3() {
        Solution solution=new Solution();

        int[] nums1={};
        int[] nums2={1};

        var res = solution.findMedianSortedArrays(nums1,nums2);
        assertEquals(1,res, 0.01);
    }
    @Test
    void test4() {
        Solution solution=new Solution();

        int[] nums1={};
        int[] nums2={2,3};

        var res = solution.findMedianSortedArrays(nums1,nums2);
        assertEquals(2.5,res, 0.01);
    }

}