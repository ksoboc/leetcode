package DeletetheMiddleNodeofaLinkedList;

import Common.ListNode;
import Common.ListUtil;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void test1() {
        Solution solution=new Solution();

        ListNode node = ListUtil.arrayToList(new int[]{1,3,4,7,1,2,6});
        solution.deleteMiddle(node);

        String str=ListUtil.listToString(node);
        System.out.println("str = " + str);
        assertArrayEquals(new int[]{1,3,4,1,2,6}, ListUtil.listToArray(node));

    }
    @Test
    void test2() {
        Solution solution=new Solution();

        ListNode node = ListUtil.arrayToList(new int[]{1,2,3,4});
        solution.deleteMiddle(node);

        String str=ListUtil.listToString(node);
        System.out.println("str = " + str);
        assertArrayEquals(new int[]{1,2,4}, ListUtil.listToArray(node));
    }
    @Test
    void test3() {
        Solution solution=new Solution();

        ListNode node = ListUtil.arrayToList(new int[]{2,1});
        solution.deleteMiddle(node);

        String str=ListUtil.listToString(node);
        System.out.println("str = " + str);
        assertArrayEquals(new int[]{2}, ListUtil.listToArray(node));
    }

}