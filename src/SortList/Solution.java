package SortList;

public class Solution {
    public ListNode sortList(ListNode head) {
        if (head==null || head.next==null)
            return head;

        ListNode left = head;
        var right = split(head);


        left = sortList(left);
        right = sortList(right);

        ListNode merged = merge(left,right);

        return merged;

    }

    private ListNode split(ListNode head) {
        ListNode middle = findMiddle(head);
        ListNode tmp = middle.next;
        middle.next = null;
        return tmp;
    }

    private ListNode merge(ListNode left, ListNode right) {
        ListNode dummy = new ListNode();
        ListNode tail = dummy;

        while (left!=null && right!=null) {
            if (left.val<right.val) {
                tail.next = left;
                left=left.next;
            } else {
                tail.next = right;
                right=right.next;
            }
            tail=tail.next;
        }
        if (left!=null)
            tail.next = left;
        if (right!=null)
            tail.next = right;

        return dummy.next;
    }

    private ListNode findMiddle(ListNode head) {
        ListNode fast = head.next;
        ListNode slow = head;

        while (fast!=null && fast.next!=null) {
            slow=slow.next;
            fast=fast.next.next;
        }

        return slow;
    }

}

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}