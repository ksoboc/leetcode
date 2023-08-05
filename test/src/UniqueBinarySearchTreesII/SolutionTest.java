package UniqueBinarySearchTreesII;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void test1() {
        Solution solution=new Solution();
        var res = solution.generateTrees(3);
        System.out.println("res = " + res);
    }
    @Test
    void test2() {
        Solution solution=new Solution();
        var res = solution.generateTrees(1);
        System.out.println("res = " + res);
    }

}