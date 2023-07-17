package AddTwoNumbersII;

import java.util.Stack;

public class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();

        while (l1!=null) {
            stack1.push(l1.val);
            l1=l1.next;
        }
        while (l2!=null) {
            stack2.push(l2.val);
            l2=l2.next;
        }

        ListNode dummy = new ListNode();

        int carry = 0;
        while (!stack1.isEmpty() || !stack2.isEmpty() || carry>0) {
            int op1 = stack1.isEmpty() ? 0 : stack1.pop();
            int op2 = stack2.isEmpty() ? 0 : stack2.pop();
            int sum = op1 + op2 + carry;
            carry = sum / 10;
            sum %= 10;
            var node = new ListNode(sum);
            node.next = dummy.next;
            dummy.next = node;
        }

        return dummy.next;

    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

