package ArrayWithElementsNotEqualtoAverageofNeighbors;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    private Solution solution=new Solution();

    @Test
    void test() {
        var res = solution.rearrangeArray(new int[]{1,2,3,4,5});
        System.out.println(Arrays.toString(res));
    }

    @Test
    void test2() {
        var res = solution.rearrangeArray(new int[]{1,2,3,4,5,6});
        System.out.println(Arrays.toString(res));
    }

}