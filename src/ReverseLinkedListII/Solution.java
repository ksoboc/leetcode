package ReverseLinkedListII;

public class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode dummy = new ListNode(0,head);

        var leftPrev = dummy;
        var cur = head;
        for (int i = 1; i < left; i++) {
            leftPrev=cur;
            cur=cur.next;

        }
        ListNode prev = null;
        for (int i = 1; i <= right-left+1; i++) {
            var tmpNext = cur.next;
            cur.next=prev;
            prev=cur;
            cur=tmpNext;
        }

        leftPrev.next.next=cur;
        leftPrev.next=prev;

        return dummy.next;
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }
}
