package MinimumNumberofOperationstoMakeArrayContinuous;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Solution {
    public int minOperations(int[] nums) {
        int n=nums.length;
        Set<Integer> set = new HashSet<>();
        for (var num:nums)
            set.add(num);

        int[] arr=new int[set.size()];
        int i=0;
        for (var num:set) {
            arr[i++]=num;
        }
        Arrays.sort(arr);
        int r=0;
        int nrOps = n;
        for (int l=0;l<arr.length;++l) {
            while (r<arr.length&&arr[r]<arr[l]+n)
                ++r;
            int cntInRange = r-l;
            nrOps = Math.min(nrOps,n-cntInRange);
        }
        return nrOps;
    }
}
