package ConvertSortedArraytoBinarySearchTree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    private Solution solution=new Solution();

    @Test
    void test() {
        var res = solution.sortedArrayToBST(new int[]{-10,-3,0,5,9});

        System.out.println("res = " + res);
    }

}