package ArithmeticSubarrays;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void test1() {
        Solution solution=new Solution();
        int[] nums = {4,6,5,9,3,7};
        int[] l = {0,0,2};
        int[] r = {2,3,5};

        var res = solution.checkArithmeticSubarrays(nums,l,r);
        assertEquals(List.of(true,false,true),res);
    }
    @Test
    void test2() {
        Solution solution=new Solution();
        int[] nums = {-12,-9,-3,-12,-6,15,20,-25,-20,-15,-10};
        int[] l = {0,1,6,4,8,7};
        int[] r = {4,4,9,7,9,10};

        var res = solution.checkArithmeticSubarrays(nums,l,r);
        assertEquals(List.of(false,true,false,false,true,true),res);
    }

}