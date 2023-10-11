package NumberofFlowersinFullBloom;

import java.util.*;

public class SolutionLineSweep {
    public int[] fullBloomFlowers(int[][] flowers, int[] people) {
        Map<Integer,Integer> diff = new TreeMap<>();
        for (var interval:flowers) {
            int start = interval[0];
            int end = interval[1]+1;
            diff.put(start,diff.getOrDefault(start,0)+1);
            diff.put(end,diff.getOrDefault(end,0)-1);
        }
        diff.put(0,0);
        int curr=0;
        NavigableMap<Integer,Integer> prefixMap = new TreeMap<>();
        for (int key: diff.keySet()) {
            curr+=diff.get(key);
            prefixMap.put(key,curr);
        }

        int[] ans = new int[people.length];
        for (int i=0;i< people.length;++i) {
            int pos = prefixMap.floorKey(people[i]);
            ans[i]=prefixMap.get(pos);
        }
        return ans;
    }

    private int findPos(List<Integer> positions, int day) {
        int l=0;
        int r=positions.size()-1;
        while (l<=r) {
            int m=l+(r-l)/2;
            if (positions.get(m)>day) {
                r=m-1;
            } else {
                l=m+1;
            }
        }
        return r;
    }

}
