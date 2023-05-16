package SwapNodesinPairs;

import Common.ListNode;
import Common.ListUtil;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void test1() {
        Solution solution=new Solution();
        ListNode node = ListUtil.arrayToList(new int[]{1,2,3,4});
        ListNode head = solution.swapPairs(node);
        assertArrayEquals(new int[]{2,1,4,3}, ListUtil.listToArray(head));
    }
    @Test
    void test2() {
        Solution solution=new Solution();
        ListNode node = null;
        ListNode head = solution.swapPairs(node);
        assertArrayEquals(new int[]{}, ListUtil.listToArray(head));
    }

    @Test
    void test3() {
        Solution solution=new Solution();
        ListNode node = new ListNode(1);
        ListNode head = solution.swapPairs(node);
        assertArrayEquals(new int[]{1}, ListUtil.listToArray(head));
    }

}