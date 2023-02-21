package NamingaCompany;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void test1() {
        Solution solution=new Solution();
        assertEquals(6, solution.distinctNames(new String[]{"coffee","donuts","time","toffee"}));
    }
    @Test
    void test2() {
        Solution solution=new Solution();
        assertEquals(0, solution.distinctNames(new String[]{"lack","back"}));
    }

}