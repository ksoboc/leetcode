package SplitLinkedListinParts;

public class Solution {
    public ListNode[] splitListToParts(ListNode head, int k) {
        int listLength = 0;
        ListNode node = head;
        while (node != null) {
            ++listLength;
            node = node.next;
        }
        int partLength = listLength / k;
        int remainder = listLength % k;

        ListNode[] response = new ListNode[k];
        node = head;
        for (int partNo = 0; partNo < k; ++partNo) {
            ListNode dummy = new ListNode();
            ListNode curr = dummy;
            int last = partLength + (remainder > 0 ? 1 : 0);
            int i = 0;
            while (i < last && node != null) {
                curr.next = node;
                curr = curr.next;
                node = node.next;

                ++i;
            }
            curr.next = null;
            response[partNo] = dummy.next;
            --remainder;
        }
        return response;
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
