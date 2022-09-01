package NextGreaterElementI;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {

    private Solution solution;

    @BeforeEach
    void prep() {
        solution = new Solution();
    }

    @Test
    void test1() {
        int[] nums1 = {4, 1, 2};
        int[] nums2 = {1, 3, 4, 2};

        var res = solution.nextGreaterElement(nums1, nums2);
        var list = Arrays.stream(res).boxed().collect(Collectors.toList());
        System.out.println("list = " + list);
    }

    @Test
    void test2() {
        int[] nums1 = {2, 4};
        int[] nums2 = {1, 2, 3, 4};

        var res = solution.nextGreaterElement(nums1, nums2);
        var list = Arrays.stream(res).boxed().collect(Collectors.toList());
        System.out.println("list = " + list);
    }


    @Test
    void test3() {
        int[] nums1 = {1,3,5,2,4};
        int[] nums2 = {6,5,4,3,2,1,7};

        var res = solution.nextGreaterElement(nums1, nums2);
        var list = Arrays.stream(res).boxed().collect(Collectors.toList());
        System.out.println("list = " + list);
    }

}