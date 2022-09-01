package FindKClosestElements;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void test() {
        Solution solution =new Solution();

        List<Integer> list = solution.findClosestElements(new int[]{1,2,3,4,5},4,3);
        assertIterableEquals(Arrays.asList(1,2,3,4), list);
    }

    @Test
    void test2() {
        Solution solution =new Solution();

        List<Integer> list = solution.findClosestElements(new int[]{1,2,3,4,5},4,-1);
        assertIterableEquals(Arrays.asList(1,2,3,4), list);
    }

}