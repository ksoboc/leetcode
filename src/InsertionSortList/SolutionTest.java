package InsertionSortList;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    private Solution solution=new Solution();

    @Test
    void test() {
        ListNode l1=new ListNode(4);
        l1.next=new ListNode(2);
        l1.next.next=new ListNode(1);
        l1.next.next.next=new ListNode(3);

        l1=solution.insertionSortList(l1);

        while (l1!=null) {
            System.out.print(l1.val + ", ");
            l1=l1.next;
        }
    }

}