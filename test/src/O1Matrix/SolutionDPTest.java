package O1Matrix;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class SolutionDPTest {
    @Test
    void test1() {
        SolutionDP solution=new SolutionDP();
        int[][] mat = {{0,0,0},{0,1,0},{0,0,0}};
        var res = solution.updateMatrix(mat);
        System.out.println("Arrays.deepToString(res) = " + Arrays.deepToString(res));
        assertArrayEquals(new int[][]{{0,0,0},{0,1,0},{0,0,0}},res);
    }
    @Test
    void test2() {
        SolutionDP solution=new SolutionDP();
        int[][] mat = {{0,0,0},{0,1,0},{1,1,1}};
        var res = solution.updateMatrix(mat);
        System.out.println("Arrays.deepToString(res) = " + Arrays.deepToString(res));
        assertArrayEquals(new int[][]{{0,0,0},{0,1,0},{1,2,1}},res);
    }

}