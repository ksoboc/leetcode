package Searcha2DMatrix;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void test1() {
        Solution solution=new Solution();
        int[][] matrix = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        var res = solution.searchMatrix(matrix,3);
        assertTrue(res);

    }
    @Test
    void test2() {
        Solution solution=new Solution();
        int[][] matrix = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        var res = solution.searchMatrix(matrix,13);
        assertFalse(res);

    }

}