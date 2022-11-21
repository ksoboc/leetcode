package ThreeSum;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void test() {
        Solution solution=new Solution();

        var res = solution.threeSum(new int[]{-1,0,1,2,-1,-4});
        System.out.println("res = " + res);
    }
    @Test
    void test2() {
        Solution solution=new Solution();

        var res = solution.threeSum(new int[]{0,1,1});
        System.out.println("res = " + res);
    }
    @Test
    void test3() {
        Solution solution=new Solution();

        var res = solution.threeSum(new int[]{0,0,0});
        System.out.println("res = " + res);
    }
    @Test
    void test4() {
        Solution solution=new Solution();
        var res = solution.threeSum(new int[]{0,0,0,0});
        System.out.println("res = " + res);
    }


}