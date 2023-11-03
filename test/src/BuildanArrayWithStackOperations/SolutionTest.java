package BuildanArrayWithStackOperations;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void test1() {
        Solution solution=new Solution();
        int[] target = {1,3};
        var res = solution.buildArray(target,3);
        assertEquals(List.of("Push","Push","Pop","Push"),res);
    }
    @Test
    void test2() {
        Solution solution=new Solution();
        int[] target = {1,2,3};
        var res = solution.buildArray(target,3);
        assertEquals(List.of("Push","Push","Push"),res);
    }
    @Test
    void test3() {
        Solution solution=new Solution();
        int[] target = {1,2};
        var res = solution.buildArray(target,4);
        assertEquals(List.of("Push","Push"),res);
    }

}