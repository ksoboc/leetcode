package AddBinary;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void test1() {
        Solution solution=new Solution();
        assertEquals("100",solution.addBinary("11","1"));
    }
    @Test
    void test2() {
        Solution solution=new Solution();
        assertEquals("10101",solution.addBinary("1010","1011"));
    }

}