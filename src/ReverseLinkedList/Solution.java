package ReverseLinkedList;

public class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;

        while (curr!=null) {
            var nxt = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nxt;
        }
        return prev;
    }

    public ListNode reverseListRec(ListNode head) {
        if (head==null)
            return null;

        var newHead = head;
        if (head.next!=null) {
            newHead = reverseListRec(head.next);
            head.next.next = head;
        }
        head.next = null;
        return newHead;

    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}