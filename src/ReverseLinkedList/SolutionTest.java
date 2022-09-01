package ReverseLinkedList;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    private Solution solution = new Solution();

    @Test
    void test() {
        int[] table = {1,2,3,4,5};
        var list = createList(table);
        ListNode res = solution.reverseListRec(list);
        printList(res);
    }

    private ListNode createList(int[] table) {
        ListNode dummy = new ListNode();
        ListNode curr = dummy;
        for (var num: table
             ) {
            curr.next = new ListNode(num);
            curr = curr.next;
        }
        return dummy.next;
    }

    private void printList(ListNode res) {
        for (var node = res; node !=null; node=node.next) {
            System.out.print(node.val + ", ");

        }
        System.out.println();
    }

}