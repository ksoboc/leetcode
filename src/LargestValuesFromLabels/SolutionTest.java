package LargestValuesFromLabels;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void test1() {
        Solution solution=new Solution();
        var res = solution.largestValsFromLabels(new int[]{5,4,3,2,1},new int[]{1,1,2,2,3},3,1);
        assertEquals(9,res);
    }
    @Test
    void test2() {
        Solution solution=new Solution();
        var res = solution.largestValsFromLabels(new int[]{5,4,3,2,1},new int[]{1,3,3,3,2},3,2);
        assertEquals(12,res);
    }

}