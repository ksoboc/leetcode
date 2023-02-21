package FindKClosestElements;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        int l=0,r=arr.length-k;
        int m=0;
        while (l<r) {
            m = (l+r)/2;
            if (x-arr[m]<=arr[m+k]-x)
                r=m;
            else
                l=m+1;

        }
        List<Integer> res=new ArrayList<>();
        for (int i = l; i < l+k; i++) {
            res.add(arr[i]);
        }

        return res;

    }
}
