package ReverseLinkedListII;

import java.util.List;

public class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode dummy = new ListNode(0,head);
        ListNode prevLeft = dummy;
        ListNode node = head;
        for (int i = 1; i < left; i++) {
            prevLeft=node;
            node=node.next;
        }
        ListNode prev = null;
        for (int i = 0; i < right-left+1; i++) {
            ListNode next=node.next;
            node.next=prev;
            prev=node;
            node=next;
        }

        prevLeft.next.next=node;
        prevLeft.next=prev;

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
