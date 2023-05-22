package TopKFrequentElements;

import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> freq = new HashMap<>();
        for (var num:nums) {
            freq.put(num, freq.getOrDefault(num,0) +1);
        }
        Comparator<int[]> comparator = (a,b) -> Integer.compare(a[1],b[1]);
        PriorityQueue<int[]> priorityQueue = new PriorityQueue<>(comparator);

        for (var key:freq.keySet()) {
            priorityQueue.offer(new int[]{key,freq.get(key)});
            if (priorityQueue.size()>k)
                priorityQueue.poll();
        }

        int size = priorityQueue.size();
        int[] answer = new int[size];
        for (int i = 0; i < size; i++) {
            answer[i] = priorityQueue.poll()[0];
        }

        return answer;
    }
}
