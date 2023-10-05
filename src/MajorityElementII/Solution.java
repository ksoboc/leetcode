package MajorityElementII;

import java.util.*;

public class Solution {
    public List<Integer> majorityElement(int[] nums) {
        Set<Integer> set=new HashSet<>();
        Map<Integer,Integer> counts = new HashMap<>();

        int nthird = nums.length/3;

        for (var n:nums) {
            counts.put(n, counts.getOrDefault(n,0)+1);
            if (counts.get(n)>nthird) {
                set.add(n);
                if (set.size()==2)
                    return new ArrayList<>(set);
            }
        }
        return new ArrayList<>(set);
    }
}
