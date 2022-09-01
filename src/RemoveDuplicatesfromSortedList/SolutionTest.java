package RemoveDuplicatesfromSortedList;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    private Solution solution=new Solution();

    @Test
    void test() {
        ListNode h = new ListNode(1);
        h.next=new ListNode(1);
        h.next.next=new ListNode(2);
        solution.deleteDuplicates(h);
        while (h!=null) {
            System.out.print(h.val + ", ");
            h=h.next;
        }
        System.out.println();
    }

}