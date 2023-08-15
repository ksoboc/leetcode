package PartitionList;

import Common.ListNode;

public class Solution {
    public ListNode partition(ListNode head, int x) {
        ListNode left = new ListNode();
        ListNode right = new ListNode();
        ListNode leftTail = left;
        ListNode rightTail = right;
        while (head != null) {
            if (head.val < x) {
                leftTail.next = head;
                leftTail = head;
            } else {
                rightTail.next = head;
                rightTail = head;
            }
            head = head.next;
        }
        leftTail.next = right.next;
        rightTail.next = null;

        return left.next;
    }
}
