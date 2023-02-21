package AllPathsFromSourcetoTarget;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void test1() {
        Solution solution=new Solution();
        var res = solution.allPathsSourceTarget(new int[][]{{1,2},{3},{3},{}});
        System.out.println("res = " + res);
    }

    @Test
    void test2() {
        Solution solution=new Solution();
        var res = solution.allPathsSourceTarget(new int[][]{{4,3,1},{3,2,4},{3},{4},{}});
        System.out.println("res = " + res);
    }

}