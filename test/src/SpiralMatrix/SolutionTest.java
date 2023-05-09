package SpiralMatrix;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void test1() {
        Solution solution=new Solution();
        int[][] matrix={{1,2,3},{4,5,6},{7,8,9}};

        var res = solution.spiralOrder(matrix);
        System.out.println("res = " + res);
        assertArrayEquals(new Integer[]{1, 2, 3, 6, 9, 8, 7, 4, 5}, res.toArray(new Integer[res.size()]));
    }
    @Test
    void test2() {
        Solution solution=new Solution();
        int[][] matrix={{1,2,3,4},{5,6,7,8},{9,10,11,12}};

        var res = solution.spiralOrder(matrix);
        System.out.println("res = " + res);
        assertArrayEquals(new Integer[]{1,2,3,4,8,12,11,10,9,5,6,7}, res.toArray(new Integer[res.size()]));
    }

}