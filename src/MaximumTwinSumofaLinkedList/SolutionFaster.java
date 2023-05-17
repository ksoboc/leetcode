package MaximumTwinSumofaLinkedList;

public class SolutionFaster {

    public int pairSum(ListNode head) {
        ListNode slow = head, fast = head, pre = null, curr;
        int ans = 0;
        //instead of going to mid and reversing second half
        //we simply can reverse first half till mid which reduce time
        while (fast != null) {
            fast = fast.next.next;
            curr = slow;
            slow = slow.next;
            curr.next = pre;
            pre = curr;
        }
        while (slow != null) {
            ans = Math.max(ans, pre.val + slow.val);
            slow = slow.next;
            pre = pre.next;
        }
        return ans;
    }
}

