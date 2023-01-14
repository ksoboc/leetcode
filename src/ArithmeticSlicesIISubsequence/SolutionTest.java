package ArithmeticSlicesIISubsequence;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void test() {
        Solution solution=new Solution();

        var res=solution.numberOfArithmeticSlices(new int[]{2,4,6,8,10});
        assertEquals(7,res);
    }

}