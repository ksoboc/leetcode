package FindKClosestElements;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void test1() {
        Solution solution=new Solution();

        var res = solution.findClosestElements(new int[]{1,2,3,4,5},4,3);
        System.out.println("res = " + res);
    }
    @Test
    void test2() {
        Solution solution=new Solution();

        var res = solution.findClosestElements(new int[]{1,2,3,4,5},2,3);
        System.out.println("res = " + res);
    }

}