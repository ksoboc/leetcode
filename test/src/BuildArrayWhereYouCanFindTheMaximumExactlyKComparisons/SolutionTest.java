package BuildArrayWhereYouCanFindTheMaximumExactlyKComparisons;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void test1() {
        Solution solution=new Solution();
        var res = solution.numOfArrays(2,3,1);
        System.out.println("res = " + res);
        assertEquals(6,res);
    }
    @Test
    void test2() {
        Solution solution=new Solution();
        var res = solution.numOfArrays(5,2,3);
        System.out.println("res = " + res);
        assertEquals(0,res);
    }
    @Test
    void test3() {
        Solution solution=new Solution();
        var res = solution.numOfArrays(9,1,1);
        System.out.println("res = " + res);
        assertEquals(1,res);
    }
    @Test
    void test4() {
        Solution solution=new Solution();
        var res = solution.numOfArrays(50,100,25);
        System.out.println("res = " + res);
        assertEquals(34549172,res);
    }

}