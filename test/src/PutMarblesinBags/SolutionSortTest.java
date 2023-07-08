package PutMarblesinBags;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionSortTest {
    @Test
    void test1() {
        SolutionSort solution=new SolutionSort();
        var res = solution.putMarbles(new int[]{1,3,5,1},2);
        System.out.println("res = " + res);
        assertEquals(res,4);
    }
    @Test
    void test2() {
        SolutionSort solution=new SolutionSort();
        var res = solution.putMarbles(new int[]{1, 3},2);
        System.out.println("res = " + res);
        assertEquals(res,0);
    }

}