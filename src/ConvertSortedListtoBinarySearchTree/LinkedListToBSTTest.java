package ConvertSortedListtoBinarySearchTree;

import Common.ListNode;
import Common.TreeNode;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class LinkedListToBSTTest {
    @Test
    void test1() {
        LinkedListToBST solution=new LinkedListToBST();
        ListNode head = Common.ListUtil.arrayToList(new int[]{-10,-3,0,5,9});
        TreeNode treeNode=solution.sortedListToBST(head);
        var res = Common.TreeUtil.treeToArray(treeNode);
        System.out.println("Arrays.toString(res) = " + Arrays.toString(res));
    }

}