package MergekSortedLists;

import Common.ListNode;

public class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        int k = lists.length;
        ListNode dummy = new ListNode(0);
        ListNode head = dummy;


        boolean end = false;
        while (!end) {
            int min = Integer.MAX_VALUE;
            for (int i = 0; i < k; i++) {
                if (lists[i] != null) {
                    min = Math.min(min, lists[i].val);
                }
            }

            for (int i = 0; i < k; i++) {
                while (lists[i] != null && lists[i].val == min) {
                    head.next = lists[i];
                    head = head.next;
                    lists[i] = lists[i].next;
                }
            }
            end = true;
            for (int i = 0; i < k; i++) {
                if (lists[i] != null) {
                    end = false;
                    break;
                }
            }
        }
        return dummy.next;

    }
}
