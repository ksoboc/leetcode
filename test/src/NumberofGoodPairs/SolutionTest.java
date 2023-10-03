package NumberofGoodPairs;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void test1() {
        Solution solution=new Solution();
        var res=solution.numIdenticalPairs(new int[]{1,2,3,1,1,3});
        assertEquals(4,res);
    }
    @Test
    void test2() {
        Solution solution=new Solution();
        var res=solution.numIdenticalPairs(new int[]{1,1,1,1});
        assertEquals(6,res);
    }
    @Test
    void test3() {
        Solution solution=new Solution();
        var res=solution.numIdenticalPairs(new int[]{1,2,3});
        assertEquals(0,res);
    }

}