package SingleThreadedCPU;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    private Solution solution=new Solution();

    @Test
    void test() {
        int[][] tasks = {{1,2},{2,4},{3,2},{4,1}};

        var res=solution.getOrder(tasks);

        System.out.println("res = " + Arrays.toString(res));
        assertArrayEquals(new int[]{0,2,3,1},res);
    }

    //
    @Test
    void test2() {
        int[][] tasks = {{7,10},{7,12},{7,5},{7,4},{7,2}};

        var res=solution.getOrder(tasks);

        System.out.println("res = " + Arrays.toString(res));
        assertArrayEquals(new int[]{4, 3, 2, 0, 1},res);
    }

}