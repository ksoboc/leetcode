package SingleNumberII;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void test1() {
        Solution solution=new Solution();
        int[] nums={2,2,3,2};
        var res = solution.singleNumber(nums);
        System.out.println("res = " + res);
    }

    @Test
    void test2() {
        Solution solution=new Solution();
        int[] nums={0,1,0,1,0,1,99};
        var res = solution.singleNumber(nums);
        System.out.println("res = " + res);
    }

}