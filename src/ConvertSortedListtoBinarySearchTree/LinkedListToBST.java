package ConvertSortedListtoBinarySearchTree;

import Common.ListNode;
import Common.TreeNode;

public class LinkedListToBST {
    private ListNode head;

    private int treeLen(ListNode head) {
        int ans = 0;


        while (head != null) {
            ans += 1;
            head = head.next;
        }
        return ans;
    }

    private TreeNode dfs(int l, int r) {
        if (l > r) {
            return null;
        }
        if (head == null) {
            return null;
        }

        int mid = l + (r - l) / 2;

        TreeNode lsubTree = dfs(l, mid - 1);

        TreeNode tree = new TreeNode(head.val);
        tree.left = lsubTree;
        head = head.next;

        tree.right = dfs(mid + 1, r);

        return tree;
    }

    public TreeNode sortedListToBST(ListNode head) {

        this.head = head;
        int n = treeLen(head);

        return dfs(0, n - 1);
    }
}
