package MergekSortedLists;

import Common.ListNode;
import Common.ListUtil;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

class SolutionRecTest {
    @Test
    void test1() {
        SolutionRec solution=new SolutionRec();
        ListNode[] lists = {ListUtil.arrayToList(new int[]{1,4,5}),ListUtil.arrayToList(new int[]{1,3,4}),ListUtil.arrayToList(new int[]{2,6})};
        var res = solution.mergeKLists(lists);
        var arr = ListUtil.listToArray(res);
        System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr));
    }
    @Test
    void test2() {
        SolutionRec solution=new SolutionRec();
        ListNode[] lists = {};
        var res = solution.mergeKLists(lists);
        var arr = ListUtil.listToArray(res);
        System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr));
    }

    @Test
    void test3() {
        SolutionRec solution=new SolutionRec();
        ListNode[] lists = {null};
        var res = solution.mergeKLists(lists);
        var arr = ListUtil.listToArray(res);
        System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr));
    }


}