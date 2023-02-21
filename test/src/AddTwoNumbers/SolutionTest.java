package AddTwoNumbers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void test1() {
        Solution solution=new Solution();
        ListNode l1 = new ListNode(2);
        l1.next=new ListNode(4);
        l1.next.next=new ListNode(3);

        ListNode l2 = new ListNode(5);
        l2.next=new ListNode(6);
        l2.next.next=new ListNode(4);

        var res = solution.addTwoNumbers(l1,l2);
        System.out.print("res=");
        for (var l=res;l!=null;l=l.next) {
            System.out.print(l.val );
            if (l.next!=null)
                System.out.print(", ");
        }
        System.out.println();
    }

    @Test
    void test2() {
        Solution solution=new Solution();
        ListNode l1 = new ListNode(0);

        ListNode l2 = new ListNode(0);

        var res = solution.addTwoNumbers(l1,l2);
        System.out.print("res=");
        for (var l=res;l!=null;l=l.next) {
            System.out.print(l.val );
            if (l.next!=null)
                System.out.print(", ");
        }
        System.out.println();
    }
    @Test
    void test3() {
        Solution solution=new Solution();
        ListNode l1 = new ListNode(9);
        l1.next=new ListNode(9);
        l1.next.next=new ListNode(9);
        l1.next.next.next=new ListNode(9);
        l1.next.next.next.next=new ListNode(9);
        l1.next.next.next.next.next=new ListNode(9);
        l1.next.next.next.next.next.next=new ListNode(9);

        ListNode l2 = new ListNode(9);
        l2.next=new ListNode(9);
        l2.next.next=new ListNode(9);
        l2.next.next.next=new ListNode(9);

        var res = solution.addTwoNumbers(l1,l2);
        System.out.print("res=");
        for (var l=res;l!=null;l=l.next) {
            System.out.print(l.val );
            if (l.next!=null)
                System.out.print(", ");
        }
        System.out.println();
    }
    @Test
    void test4() {
        Solution solution=new Solution();
        ListNode l1 = new ListNode(1);
        l1.next=new ListNode(8);

        ListNode l2 = new ListNode(0);

        var res = solution.addTwoNumbers(l1,l2);
        System.out.print("res=");
        for (var l=res;l!=null;l=l.next) {
            System.out.print(l.val );
            if (l.next!=null)
                System.out.print(", ");
        }
        System.out.println();
    }

}