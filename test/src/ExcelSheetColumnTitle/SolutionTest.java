package ExcelSheetColumnTitle;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void test1() {
        Solution solution=new Solution();
        var res = solution.convertToTitle(1);
        assertEquals("A",res);
    }
    @Test
    void test2() {
        Solution solution=new Solution();
        var res = solution.convertToTitle(28);
        assertEquals("AB",res);
    }
    @Test
    void test3() {
        Solution solution=new Solution();
        var res = solution.convertToTitle(701);
        assertEquals("ZY",res);
    }

}