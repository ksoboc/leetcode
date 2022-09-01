package DailyTemperatures;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    private Solution solution = new Solution();

    @Test
    void test() {
        var res = solution.dailyTemperatures(new int[]{73,74,75,71,69,72,76,73});
        System.out.println("res = " + Arrays.toString(res));
        assertArrayEquals(new int[]{1, 1, 4, 2, 1, 1, 0, 0}, res);
    }
    @Test
    void test2() {
        var res = solution.dailyTemperatures(new int[]{30,40,50,60});
        System.out.println("res = " + Arrays.toString(res));
        assertArrayEquals(new int[]{1,1,1,0}, res);
    }
    @Test
    void test3() {
        var res = solution.dailyTemperatures(new int[]{30,60,90});
        System.out.println("res = " + Arrays.toString(res));
        assertArrayEquals(new int[]{1,1,0}, res);
    }

}