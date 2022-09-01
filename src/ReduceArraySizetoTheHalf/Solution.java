package ReduceArraySizetoTheHalf;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int minSetSize(int[] arr) {
        Map<Integer,Integer> freq = new HashMap<>();
        int max = -1;
        for (var elem:arr) {
            var cnt = freq.getOrDefault(elem,0) + 1;
            freq.put(elem, cnt);
            max=Math.max(cnt,max);
        }
        int[] cntFreq = new int[max+1];
        freq.keySet().forEach(cnt -> ++cntFreq[freq.get(cnt)]);

        int total = 0;
        int half = (int) Math.ceil((double)arr.length/2);
        int res = 0;
        for (int i = max; i >= 0 ; --i) {
            if (total + i*cntFreq[i] < half) {
                total+=i*cntFreq[i];
                res+=cntFreq[i];
            } else {
                res += (int)Math.ceil( ((double)half - total) / i );
                break;
            }
        }
        return res;
    }
}
