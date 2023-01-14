package MaximumIceCreamBars;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void test1() {
        Solution solution=new Solution();

        assertEquals(4,solution.maxIceCream(new int[]{1,3,2,4,1},7));
    }

}