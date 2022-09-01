package SorttheMatrixDiagonally;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class Solution3Test {
    @Test
    void test() {
        Solution3 solution3 =new Solution3();
        var res = solution3.diagonalSort(new int[][]{{3,3,1,1},{2,2,1,2},{1,1,1,2}});

        System.out.println("res = " + Arrays.deepToString(res));
    }
    @Test
    void test2() {
        var solution3 =new Solution3();
        var res = solution3.diagonalSort(new int[][]{{11,25,66,1,69,7},{23,55,17,45,15,52},{75,31,36,44,58,8},{22,27,33,25,68,4},{84,28,14,11,5,50}});

        System.out.println("res = " + Arrays.deepToString(res));
    }
}