package DeleteColumnstoMakeSorted;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void test1() {
        Solution solution=new Solution();
        assertEquals(1,solution.minDeletionSize(new String[]{"cba","daf","ghi"}));
    }
    @Test
    void test2() {
        Solution solution=new Solution();
        assertEquals(0,solution.minDeletionSize(new String[]{"a","b"}));
    }
    @Test
    void test3() {
        Solution solution=new Solution();
        assertEquals(3,solution.minDeletionSize(new String[]{"zyx","wvu","tsr"}));
    }
    //
    @Test
    void test4() {
        Solution solution=new Solution();
        assertEquals(2,solution.minDeletionSize(new String[]{"rrjk","furt","guzm"}));
    }
}