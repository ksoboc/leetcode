package ReverseLinkedListII;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    private Solution solution = new Solution();

    @Test
    void test1() {
        ListNode head = new ListNode(1);
        ListNode cur = head;
        for (int v=2;v<=5;++v) {
            cur.next=new ListNode(v);
            cur=cur.next;
        }

        printList(head);

        solution.reverseBetween(head,2,4);
        printList(head);
    }

    private void printList(ListNode head) {
        ListNode cur;
        for (cur= head; cur!=null; cur=cur.next) {
            System.out.print(cur.val + ", ");
        }
        System.out.println();
    }

}