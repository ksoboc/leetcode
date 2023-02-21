package AsFarfromLandasPossible;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionDPTest {
    @Test
    void test1() {
        SolutionDP solution=new SolutionDP();

        assertEquals(2, solution.maxDistance(new int[][]{{1,0,1},{0,0,0},{1,0,1}}));
    }
    @Test
    void test2() {
        SolutionDP solution=new SolutionDP();

        assertEquals(4, solution.maxDistance(new int[][]{{1,0,0},{0,0,0},{0,0,0}}));
    }

}