package MergekSortedLists;

import Common.ListNode;
import Common.ListUtil;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void test1() {
        Solution solution=new Solution();
        ListNode[] lists = {ListUtil.arrayToList(new int[]{1,4,5}),ListUtil.arrayToList(new int[]{1,3,4}),ListUtil.arrayToList(new int[]{2,6})};
        var res = solution.mergeKLists(lists);
        var arr = ListUtil.listToArray(res);
        System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr));
    }
    @Test
    void test2() {
        Solution solution=new Solution();
        ListNode[] lists = {};
        var res = solution.mergeKLists(lists);
        var arr = ListUtil.listToArray(res);
        System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr));
    }

    @Test
    void test3() {
        Solution solution=new Solution();
        ListNode[] lists = {null};
        var res = solution.mergeKLists(lists);
        var arr = ListUtil.listToArray(res);
        System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr));
    }


}