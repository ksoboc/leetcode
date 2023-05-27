package StoneGameIII;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionDPTest {
    @Test
    void test1() {
        SolutionDP solution=new SolutionDP();
        var res = solution.stoneGameIII(new int[]{1,2,3,7});
        assertEquals("Bob", res);
    }
    @Test
    void test2() {
        SolutionDP solution=new SolutionDP();
        var res = solution.stoneGameIII(new int[]{1,2,3,-9});
        assertEquals("Alice", res);
    }
    @Test
    void test3() {
        SolutionDP solution=new SolutionDP();
        var res = solution.stoneGameIII(new int[]{1,2,3,6});
        assertEquals("Tie", res);
    }

}