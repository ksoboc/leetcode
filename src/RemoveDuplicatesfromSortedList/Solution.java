package RemoveDuplicatesfromSortedList;

public class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode cur = head;
        while (cur!=null) {
            ListNode next= cur.next;
            while (next!=null && next.val==cur.val)
                next=next.next;
            cur.next=next;
            cur=next;
        }
        return head;
    }
}

class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

