package PaintingtheWalls;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionDPTest {
    @Test
    void test1() {
        SolutionDP solution=new SolutionDP();
        int[] cost = {1,2,3,2};
        int[] time = {1,2,3,2};

        var res=solution.paintWalls(cost,time);
        assertEquals(3,res);
    }
    @Test
    void test2() {
        SolutionDP solution=new SolutionDP();
        int[] cost = {2,3,4,2};
        int[] time = {1,1,1,1};

        var res=solution.paintWalls(cost,time);
        assertEquals(4,res);
    }
    @Test
    void test3() {
        SolutionDP solution=new SolutionDP();
        int[] cost = {42,8,28,35,21,13,21,35};
        int[] time = {2,1,1,1,2,1,1,2};

        var res=solution.paintWalls(cost,time);
        assertEquals(63,res);
    }


}