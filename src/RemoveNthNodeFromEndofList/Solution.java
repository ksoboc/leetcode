package RemoveNthNodeFromEndofList;

public class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        ListNode l = dummy;
        ListNode p = head;

        while (n>0 && p !=null) {
            p=p.next;
            --n;
        }

        while (p!=null) {
            l=l.next;
            p=p.next;
        }

        l.next = l.next.next;
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
