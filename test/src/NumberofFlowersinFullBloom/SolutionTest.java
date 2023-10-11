package NumberofFlowersinFullBloom;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void test1() {
        Solution solution=new Solution();
        int[][] flowers = {{1,6},{3,7},{9,12},{4,13}};
        int [] people ={2,3,7,11};
        var res=solution.fullBloomFlowers(flowers,people);
        System.out.println("Arrays.toString(res) = " + Arrays.toString(res));
        assertArrayEquals(new int[]{1,2,2,2},res);
    }
    @Test
    void test2() {
        Solution solution=new Solution();
        int[][] flowers = {{1,10},{3,3}};
        int [] people ={3,3,2};
        var res=solution.fullBloomFlowers(flowers,people);
        System.out.println("Arrays.toString(res) = " + Arrays.toString(res));
        assertArrayEquals(new int[]{2,2,1},res);
    }

}