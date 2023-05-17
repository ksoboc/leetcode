package MaximumTwinSumofaLinkedList;

public class Solution {

    public int pairSum(ListNode head) {
        if (head==null)
            return 0;

        ListNode slow =head;
        ListNode fast=head;

        while (fast!=null && fast.next!=null) {
            slow=slow.next;
            fast=fast.next.next;
        }

        ListNode node = null;
        while (slow!=null) {
            ListNode temp = slow.next;
            slow.next = node;
            node = slow;
            slow = temp;
        }

        int maxSum = Integer.MIN_VALUE;
        while (node!=null) {
            int curSum = node.val + head.val;
            maxSum = Math.max(maxSum,curSum);
            node=node.next;
            head=head.next;
        }

        return maxSum;
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

