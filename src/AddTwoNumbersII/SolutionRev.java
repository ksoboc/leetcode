package AddTwoNumbersII;

import java.util.Stack;

public class SolutionRev {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode r1 = reverse(l1);
        ListNode r2 = reverse(l2);

        ListNode dummy = new ListNode();

        int carry = 0;
        while (r1 != null || r2 != null || carry > 0) {
            int op1 = 0;
            if (r1 != null) {
                op1 = r1.val;
                r1 = r1.next;
            }
            ;
            int op2 = 0;
            if (r2 != null) {
                op2 = r2.val;
                r2 = r2.next;
            }
            int sum = op1 + op2 + carry;
            carry = sum / 10;
            sum %= 10;
            var node = new ListNode(sum);
            node.next = dummy.next;
            dummy.next = node;
        }

        return dummy.next;

    }

    private ListNode reverse(ListNode l1) {
        ListNode prev = null;
        ListNode curr = l1;
        while (curr != null) {
            ListNode next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}

