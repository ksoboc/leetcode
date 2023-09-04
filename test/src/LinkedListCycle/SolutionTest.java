package LinkedListCycle;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void test1() {
        Solution solution=new Solution();
        ListNode head=new ListNode(3);
        head.next=new ListNode(2);
        head.next.next=new ListNode(0);
        head.next.next.next=new ListNode(-4);
        head.next.next.next.next=head.next;

        assertTrue(solution.hasCycle(head));

    }
    @Test
    void test2() {
        Solution solution=new Solution();
        ListNode head=new ListNode(1);
        head.next=new ListNode(2);
        head.next.next=head;

        assertTrue(solution.hasCycle(head));

    }
    @Test
    void test3() {
        Solution solution=new Solution();
        ListNode head=new ListNode(1);


        assertFalse(solution.hasCycle(head));

    }

}