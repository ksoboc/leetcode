package TopKFrequentElements;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    private Solution solution=new Solution();

    @Test
    void test2elem() {
        var res = solution.topKFrequent(new int[]{1,1,1,2,2,3},2);
        System.out.println("res = " + Arrays.toString(res));
    }

    @Test
    void test1elem() {
        var res = solution.topKFrequent(new int[]{1},1);
        System.out.println("res = " + Arrays.toString(res));
    }

}