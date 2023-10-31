package FindTheOriginalArrayofPrefixXor;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void test1() {
        Solution solution=new Solution();
        int[] prefix={5,2,0,3,1};
        var res = solution.findArray(prefix);
        assertArrayEquals(new int[]{5,7,2,3,2},prefix);
    }

}