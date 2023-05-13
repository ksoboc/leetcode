package CountWaysToBuildGoodStrings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionDPTest {
    @Test
    void test1() {
        SolutionDP solution=new SolutionDP();
        assertEquals(8, solution.countGoodStrings(3,3,1,1));
    }

    @Test
    void test2() {
        SolutionDP solution=new SolutionDP();
        assertEquals(5, solution.countGoodStrings(2,3,1,2));
    }

}