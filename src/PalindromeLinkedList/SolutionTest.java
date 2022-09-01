package PalindromeLinkedList;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    private Solution solution = new Solution();

    @Test
    void test() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(1);

        assertTrue(solution.isPalindrome(head));
    }

    @Test
    void test2() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);

        assertFalse(solution.isPalindrome(head));
    }

    @Test
    void testRec() {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(1);

        assertTrue(solution.isPalindromeRec(head));
    }

}