package TimeNeededtoInformAllEmployees;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void test1() {
        Solution solution=new Solution();
        var res = solution.numOfMinutes(1,0,new int[]{-1},new int[]{0});
        assertEquals(0,res);
    }



    @Test
    void test2() {
        Solution solution=new Solution();
        var res = solution.numOfMinutes(6,2,new int[]{2,2,-1,2,2,2},new int[]{0,0,1,0,0,0});
        assertEquals(1,res);
    }

}