package PartitionList;

import Common.ListNode;
import Common.ListUtil;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class SolutionTest {
    @Test
    void test1() {
        Solution solution=new Solution();
        ListNode head = ListUtil.arrayToList(new int[]{1,4,3,2,5,2});
        var res = solution.partition(head,3);
        System.out.println("res = " + Arrays.toString(ListUtil.listToArray(res)));
    }
    @Test
    void test2() {
        Solution solution=new Solution();
        ListNode head = ListUtil.arrayToList(new int[]{2,1});
        var res = solution.partition(head,2);
        System.out.println("res = " + Arrays.toString(ListUtil.listToArray(res)));
    }

}