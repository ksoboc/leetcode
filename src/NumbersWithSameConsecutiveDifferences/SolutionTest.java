package NumbersWithSameConsecutiveDifferences;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void test() {
        Solution solution=new Solution();
        var res = solution.numsSameConsecDiff(3,7);

        System.out.println("res = " + Arrays.toString(res));
    }
    @Test
    void test2() {
        Solution solution=new Solution();
        var res = solution.numsSameConsecDiff(2,1);

        System.out.println("res = " + Arrays.toString(res));
    }
    @Test
    void test3() {
        Solution solution=new Solution();
        var res = solution.numsSameConsecDiff(2,0);

        System.out.println("res = " + Arrays.toString(res));
    }

}