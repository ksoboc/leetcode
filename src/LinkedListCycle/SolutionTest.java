package LinkedListCycle;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    private Solution solution = new Solution();
    @Test
    void test() {
        ListNode node = new ListNode(3);
        node.next = new ListNode(2);
        node.next.next = new ListNode(0);
        node.next.next.next = new ListNode(-4);
        node.next.next.next.next = node.next;

        assertTrue(solution.hasCycle(node));
    }

    @Test
    void test2() {
        ListNode head = new ListNode(1);
        assertFalse(solution.hasCycle(head));

    }

}