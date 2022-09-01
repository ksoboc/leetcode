package SortList;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    private Solution solution = new Solution();

    @Test
    void test1() {
        ListNode listNode = new ListNode(4);
        listNode.next = new ListNode(2);
        listNode.next.next = new ListNode(1);
        listNode.next.next.next = new ListNode(3);

        listNode = solution.sortList(listNode);
        printList(listNode);
    }

    private void printList(ListNode listNode) {
        for (var node = listNode; node!=null ; node=node.next) {
            System.out.print(node.val + ", ");

        }
        System.out.println();
    }

    @Test
    void test2() {
        int[] nums = {-1,5,3,4,0};

        ListNode listNode = arrayToList(nums);

        solution.sortList(listNode);
        printList(listNode);
    }

    private ListNode arrayToList(int[] nums) {
        ListNode dummy = new ListNode();
        var listNode = dummy;
        for (int i = 0; i < nums.length; i++) {
            listNode.next = new ListNode(nums[i]);
            listNode=listNode.next;
        }
        return dummy.next;
    }

}