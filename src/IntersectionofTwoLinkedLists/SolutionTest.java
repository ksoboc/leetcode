package IntersectionofTwoLinkedLists;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    private Solution solution=new Solution();

    @Test
    void test() {
        ListNode l1 = new ListNode(4);
        l1.next = new ListNode(1);
        l1.next.next = new ListNode(8);
        l1.next.next.next = new ListNode(4);
        l1.next.next.next.next = new ListNode(5);

        ListNode l2 = new ListNode(5);
        l2.next=new ListNode(6);
        l2.next.next=new ListNode(1);
        l2.next.next.next=l1.next.next;

        var l3 = solution.getIntersectionNode(l1,l2);
        assertEquals(8,l3.val);
    }
}