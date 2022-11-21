package SetMismatch;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    Solution solution;
    @BeforeEach
    void init() {
        solution=new Solution();
    }

    @Test
    void test1() {
        var res = solution.findErrorNums(new int[]{1,2,2,4});
        System.out.println("Arrays.toString(res) = " + Arrays.toString(res));
    }
    @Test
    void test2() {
        var res = solution.findErrorNums(new int[]{1,1});
        System.out.println("Arrays.toString(res) = " + Arrays.toString(res));
    }

}