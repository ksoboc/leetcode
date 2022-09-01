package FindtheKthLargestIntegerintheArray;

import java.math.BigInteger;
import java.util.Comparator;
import java.util.PriorityQueue;

public class Solution {
    public String kthLargestNumber(String[] nums, int k) {
        Comparator<String> comparator = (a,b) -> a.length()==b.length()?a.compareTo(b):Integer.valueOf(a.length()).compareTo(b.length());
        PriorityQueue<String> heap = new PriorityQueue<>(comparator);
        for (var s:nums) {

            heap.offer(s);
            if (heap.size()>k)
                heap.poll();
        }


        return heap.peek();
    }

    int pos;
    String[] arr;
    public String kthLargestNumberQSel(String[] nums, int k) {
        pos = nums.length - k;
        arr=nums;
        return quickSelect(0,nums.length-1);
    }

    private String quickSelect(int l, int r) {
        var pivot = Integer.parseInt(arr[r]);
        var p = l;
        for (var i=l;i<r;++i) {
            if (Integer.parseInt(arr[i])<=pivot) {
                var tmp = arr[p];
                arr[p] = arr[i];
                arr[i] = tmp;
                ++p;
            }
        }
        var tmp = arr[p];
        arr[p] = arr[r];
        arr[r] = tmp;

        if (p<pos) {
            return quickSelect(p+1,r);
        } else if (p>pos) {
            return quickSelect(l,p-1);
        } else return arr[p];
    }


}
