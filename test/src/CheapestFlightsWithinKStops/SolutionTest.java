package CheapestFlightsWithinKStops;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void test1() {
        Solution solution=new Solution();

        assertEquals(700,solution.findCheapestPrice(4,new int[][]{{0,1,100},{1,2,100},{2,0,100},{1,3,600},{2,3,200}},0,3,1));
    }
    @Test
    void test2() {
        Solution solution=new Solution();

        assertEquals(200,solution.findCheapestPrice(3,new int[][]{{0,1,100},{1,2,100},{0,2,500}},0,2,1));
    }
    @Test
    void test3() {
        Solution solution=new Solution();

        assertEquals(500,solution.findCheapestPrice(3,new int[][]{{0,1,100},{1,2,100},{0,2,500}},0,2,0));
    }

}