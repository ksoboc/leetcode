package MaximumTwinSumofaLinkedList;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void test1() {
        ListNode head = convertToLinkedList(new int[]{5, 4, 2, 1});

        Solution solution = new Solution();
        int res = solution.pairSum(head);

        assertEquals(6, res);
    }

    @Test
    void test2() {
        ListNode head = convertToLinkedList(new int[]{4, 2, 2, 3});

        Solution solution = new Solution();
        int res = solution.pairSum(head);

        Assertions.assertEquals(7, res);
    }

    @Test
    void test3() {
        ListNode head = convertToLinkedList(new int[]{1, 100_000});

        Solution solution = new Solution();
        int res = solution.pairSum(head);

        Assertions.assertEquals(100_001, res);
    }

    private ListNode convertToLinkedList(int[] values) {
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;

        for (int value : values) {
            current.next = new ListNode(value);
            current = current.next;
        }

        return dummy.next;
    }
}