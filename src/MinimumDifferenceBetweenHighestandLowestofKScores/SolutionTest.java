package MinimumDifferenceBetweenHighestandLowestofKScores;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    private Solution solution=new Solution();

    @Test
    void test() {
        assertEquals(2,solution.minimumDifference(new int[]{9,4,1,7},2));
        assertEquals(0, solution.minimumDifference(new int[]{90},1));
    }

}