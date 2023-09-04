package LinkedListCycle;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class SolutionHashSetTest {
    @Test
    void test1() {
        SolutionHashSet solution=new SolutionHashSet();
        ListNode head=new ListNode(3);
        head.next=new ListNode(2);
        head.next.next=new ListNode(0);
        head.next.next.next=new ListNode(-4);
        head.next.next.next.next=head.next;

        assertTrue(solution.hasCycle(head));

    }
    @Test
    void test2() {
        SolutionHashSet solution=new SolutionHashSet();
        ListNode head=new ListNode(1);
        head.next=new ListNode(2);
        head.next.next=head;

        assertTrue(solution.hasCycle(head));

    }
    @Test
    void test3() {
        SolutionHashSet solution=new SolutionHashSet();
        ListNode head=new ListNode(1);


        assertFalse(solution.hasCycle(head));

    }

}