package FindFirstandLastPositionofElementinSortedArray;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class SolutionAltTest {
    @Test
    void test1() {
        SolutionAlt solution=new SolutionAlt();
        var res=solution.searchRange(new int[]{5,7,7,8,8,10},8);
        System.out.println("Arrays.toString(res) = " + Arrays.toString(res));
        assertArrayEquals(new int[]{3,4},res);
    }
    @Test
    void test2() {
        SolutionAlt solution=new SolutionAlt();
        var res=solution.searchRange(new int[]{5,7,7,8,8,10},6);
        System.out.println("Arrays.toString(res) = " + Arrays.toString(res));
        assertArrayEquals(new int[]{-1,-1},res);
    }
    @Test
    void test3() {
        SolutionAlt solution=new SolutionAlt();
        var res=solution.searchRange(new int[]{},0);
        System.out.println("Arrays.toString(res) = " + Arrays.toString(res));
        assertArrayEquals(new int[]{-1,-1},res);
    }

}