package SwappingNodesinaLinkedList;

import java.util.Deque;
import java.util.LinkedList;

public class Solution {
    public ListNode swapNodes(ListNode head, int k) {
        ListNode lNode = head;
        while (k>1) {
            lNode=lNode.next;
            --k;
        }
        ListNode rNode=head;
        ListNode cNode = lNode.next;
        while (cNode!=null) {
            rNode=rNode.next;
            cNode=cNode.next;
        }

        int temp = lNode.val;
        lNode.val = rNode.val;
        rNode.val = temp;

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
