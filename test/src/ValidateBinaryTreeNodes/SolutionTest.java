package ValidateBinaryTreeNodes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void test1() {
        Solution solution=new Solution();
        int[] leftChild = {1,-1,3,-1};
        int[] rightChild = {2,-1,-1,-1};
        var res = solution.validateBinaryTreeNodes(leftChild.length,leftChild,rightChild);
        assertTrue(res);
    }
    @Test
    void test2() {
        Solution solution=new Solution();
        int[] leftChild = {1,-1,3,-1};
        int[] rightChild = {2,3,-1,-1};
        var res = solution.validateBinaryTreeNodes(leftChild.length,leftChild,rightChild);
        assertFalse(res);
    }
    @Test
    void test3() {
        Solution solution=new Solution();
        int[] leftChild = {1,0};
        int[] rightChild = {-1,-1};
        var res = solution.validateBinaryTreeNodes(leftChild.length,leftChild,rightChild);
        assertFalse(res);
    }

}