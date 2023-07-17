package AddTwoNumbersII;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionRevTest {
    @Test
    void test1() {
        SolutionRev solution=new SolutionRev();

        ListNode l1 = new ListNode(7);
        l1.next=new ListNode(2);
        l1.next.next=new ListNode(4);
        l1.next.next.next=new ListNode(3);

        ListNode l2=new ListNode(5);
        l2.next=new ListNode(6);
        l2.next.next=new ListNode(4);

        var l3 = solution.addTwoNumbers(l1,l2);

        assertEquals(7,l3.val);
        while (l3!=null) {
            System.out.println("l3.val = " + l3.val);
            l3=l3.next;
        }

    }
    @Test
    void test3() {
        SolutionRev solution=new SolutionRev();

        ListNode l1 = new ListNode(0);

        ListNode l2=new ListNode(0);

        var l3 = solution.addTwoNumbers(l1,l2);

        assertEquals(0,l3.val);
        while (l3!=null) {
            System.out.println("l3.val = " + l3.val);
            l3=l3.next;
        }

    }

}