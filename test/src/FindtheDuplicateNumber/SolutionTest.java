package FindtheDuplicateNumber;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void test1() {
        Solution solution=new Solution();
        var res=solution.findDuplicate(new int[]{1,3,4,2,2});
        assertEquals(2,res);
    }
    @Test
    void test2() {
        Solution solution=new Solution();
        var res=solution.findDuplicate(new int[]{3,1,3,4,2});
        assertEquals(3,res);
    }
    @Test
    void test3() {
        Solution solution=new Solution();
        var res=solution.findDuplicate(new int[]{2,2,2,2,2});
        assertEquals(2,res);
    }

}