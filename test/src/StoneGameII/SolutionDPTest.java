package StoneGameII;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionDPTest {
    @Test
    void test1() {
        SolutionDP solution=new SolutionDP();
        assertEquals(10, solution.stoneGameII(new int[]{2,7,9,4,4}));
    }
    @Test
    void test2() {
        SolutionDP solution=new SolutionDP();
        assertEquals(104, solution.stoneGameII(new int[]{1,2,3,4,5,100}));
    }

}