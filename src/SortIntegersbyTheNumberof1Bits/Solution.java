package SortIntegersbyTheNumberof1Bits;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Solution {
    public int[] sortByBits(int[] arr) {
        Comparator<Integer> comparator = Comparator.comparingInt(Integer::bitCount).thenComparingInt(Integer::intValue);
        ArrayList<Integer> list=new ArrayList<>();
        for (var num:arr)
            list.add(num);
        Collections.sort(list,comparator);
        int[] ans = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            ans[i]=list.get(i);
        }
        return ans;

    }
}
