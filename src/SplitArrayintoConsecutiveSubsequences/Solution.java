package SplitArrayintoConsecutiveSubsequences;

import java.util.*;

public class Solution {
    public boolean isPossible(int[] nums) {
        if (nums.length < 3) return false;
        Map<Integer,Integer> freq = new HashMap<>();
        for (var num:nums) {
            freq.put(num, freq.getOrDefault(num,0)+1);
        }

        PriorityQueue<Integer> pq = new PriorityQueue<>(freq.keySet());
        while (!pq.isEmpty()) {
            int min = pq.peek();
            int count = 0;
            while (true) {
                if (!freq.containsKey(min)) {
                    if (count<3)
                        return false;
                    break;
                }
                freq.put(min, freq.get(min)-1);
                ++count;
                if (freq.get(min)==0) {
                    if (min !=pq.peek())
                        return false;
                    pq.poll();
                }
                if (freq.containsKey(min+1) && freq.get(min+1) < freq.get(min)+1) {
                    if (count<3) return false;
                    break;
                }
                ++min;
            }
        }

        return true;
    }

    public boolean isPossible2(int[] nums) {
        List<int[]> strings = new ArrayList<>();
        strings.add(new int[]{nums[0], 1});

        for (int i = 1; i < nums.length; i++) {
            var num = nums[i];
            var j = strings.size()-1;
            while (j>=0 && strings.get(j)[0]>num-1) {
                --j;
            }
            if (j<0) {
                strings.add(new int[]{num, 1});
            } else {
                if (strings.get(j)[0]==num-1) {
                    strings.get(j)[0]=num;
                    strings.get(j)[1]+=1;
                } else {
                    strings.add(new int[]{num, 1});
                }
            }
        }

        for (var elem:strings) {
            if (elem[1]<3)
                return false;
        }
        return true;

    }
}
