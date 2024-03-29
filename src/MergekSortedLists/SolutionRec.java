package MergekSortedLists;

import Common.ListNode;

public class SolutionRec {
    public ListNode mergeKLists(ListNode[] lists) {
        // nothing to do, simply return null
        if(lists == null || lists.length == 0) return null;
        return recursiveMerge(lists, 0, lists.length - 1);
    }

    private ListNode recursiveMerge(ListNode[] lists, int lo, int hi) {
        // base case (list size 2 or size 1)
        if(hi - lo == 1) {
            // size 2 perform merge
            return merge(lists[lo], lists[hi]);
        }
        if(hi == lo) {
            // size 1 simply return the node
            return lists[hi];
        }
        int mid = lo + (hi - lo) / 2;
        // recursive call
        ListNode left = recursiveMerge(lists, lo, mid);
        ListNode right = recursiveMerge(lists, mid + 1, hi);
        // return left and right merge
        return merge(left, right);
    }

    private ListNode merge(ListNode n1, ListNode n2) {
        // merge sort(merge two linkedList into one)
        if(n1 == null) return n2;
        if(n2 == null) return n1;
        ListNode temp1 = n1;
        ListNode temp2 = n2;
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;
        while(temp1 != null && temp2 != null) {
            if(temp1.val <= temp2.val) {
                curr.next = temp1;
                temp1 = temp1.next;
            } else {
                curr.next = temp2;
                temp2 = temp2.next;
            }
            curr = curr.next;
        }
        if(temp1 != null) curr.next = temp1;
        if(temp2 != null) curr.next = temp2;

        return dummy.next;
    }
}
