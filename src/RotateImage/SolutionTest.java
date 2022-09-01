package RotateImage;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void test1() {
        Solution solution=new Solution();

        int[][] image = {{1,2,3},{4,5,6},{7,8,9}};
        solution.rotate(image);
        //System.out.println(Arrays.deepToString(image));
        assertArrayEquals(new int[][]{{7,4,1},{8,5,2},{9,6,3}},image);

    }
    @Test
    void test2() {
        Solution solution=new Solution();

        int[][] image = {{5,1,9,11},{2,4,8,10},{13,3,6,7},{15,14,12,16}};
        solution.rotate(image);
//        System.out.println(Arrays.deepToString(image));
        assertArrayEquals(new int[][]{{15,13,2,5},{14,3,4,1},{12,6,8,9},{16,7,10,11}},image);

    }

}