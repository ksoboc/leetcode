package SwappingNodesinaLinkedList;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void test1() {
        Solution solution=new Solution();
        ListNode head = createLinkedList(new int[]{1,2,3,4,5});

        solution.swapNodes(head,2);
        assertEquals(4, getKthValue(head,2));
        assertEquals(2, getKthValue(head, 4));
    }
    @Test
    void test2() {
        Solution solution = new Solution();

        ListNode head = createLinkedList(new int[]{7, 9, 6, 6, 7, 8, 3, 0, 9, 5});

        solution.swapNodes(head, 5);
        assertEquals(8, getKthValue(head, 5));
    }

    private ListNode createLinkedList(int[] elements) {
        ListNode head = new ListNode(elements[0]);
        ListNode node = head;

        for (int i = 1; i < elements.length; i++) {
            node.next = new ListNode(elements[i]);
            node = node.next;
        }

        return head;
    }

    private int getKthValue(ListNode head, int k) {
        while (k>1) {
            head=head.next;
            --k;
        }
        return head.val;
    }

}