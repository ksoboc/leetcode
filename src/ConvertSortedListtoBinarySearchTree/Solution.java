package ConvertSortedListtoBinarySearchTree;

import Common.ListNode;
import Common.TreeNode;

public class Solution {
    public TreeNode sortedListToBST(ListNode head) {
        if (head==null)
            return null;
        ListNode slow=head;
        ListNode prev=null;
        ListNode fast=head;
        while (fast!=null && fast.next!=null) {
            prev=slow;
            slow=slow.next;
            fast=fast.next.next;
        }
        TreeNode treeNode=new TreeNode(slow.val);

        if (prev!=null) {
            prev.next = null;
            treeNode.left = sortedListToBST(head);
        }

        treeNode.right=sortedListToBST(slow.next);
        return treeNode;
    }
}
