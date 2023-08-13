package CheckifThereisaValidPartitionForTheArray;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void test1() {
        Solution solution=new Solution();
        var res = solution.validPartition(new int[]{4,4,4,5,6});
        assertTrue(res);
    }
    @Test
    void test2() {
        Solution solution=new Solution();
        var res = solution.validPartition(new int[]{1,1,1,2});
        assertFalse(res);
    }
    //
    @Test
    void test3() {
        Solution solution=new Solution();
        var res = solution.validPartition(new int[]{803201,803201,803201,803201,803202,803203});
        assertFalse(res);
    }

}