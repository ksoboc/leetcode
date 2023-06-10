package MaximumValueataGivenIndexinaBoundedArray;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void test1() {
        Solution solution=new Solution();
        var res = solution.maxValue(4,2,6);
        System.out.println("res = " + res);
        assertEquals(2,res);
    }
    @Test
    void test2() {
        Solution solution=new Solution();
        var res = solution.maxValue(6,1,10);
        System.out.println("res = " + res);
        assertEquals(3,res);
    }
    @Test
    void test3() {
        Solution solution=new Solution();
        var res = solution.maxValue(4,0,4);
        System.out.println("res = " + res);
        assertEquals(1,res);
    }

}