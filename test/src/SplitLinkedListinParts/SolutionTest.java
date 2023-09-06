package SplitLinkedListinParts;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void test1() {
        Solution solution=new Solution();
        ListNode head=new ListNode(1);
        head.next=new ListNode(2);
        head.next.next=new ListNode(3);

        var res = solution.splitListToParts(head,5);
        printTable(res);
    }
    @Test
    void test2() {
        Solution solution=new Solution();
        ListNode head=new ListNode(1);
        head.next=new ListNode(2);
        head.next.next=new ListNode(3);
        head.next.next.next=new ListNode(4);
        head.next.next.next.next=new ListNode(5);
        head.next.next.next.next.next=new ListNode(6);
        head.next.next.next.next.next.next=new ListNode(7);
        head.next.next.next.next.next.next.next=new ListNode(8);
        head.next.next.next.next.next.next.next.next=new ListNode(9);
        head.next.next.next.next.next.next.next.next.next=new ListNode(10);

        var res = solution.splitListToParts(head,3);
        printTable(res);
    }

    private void printTable(ListNode[] res) {
        System.out.print("[");
        for (int i = 0; i < res.length; i++) {
            printList(res[i]);
            if (i< res.length-1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }

    private void printList(ListNode res) {
        System.out.print("[");
        ListNode node= res;
        while (node!=null) {
            System.out.print(node.val);
            if (node.next!=null)
                System.out.print(", ");
            node=node.next;
        }
        System.out.print("]");
    }

}