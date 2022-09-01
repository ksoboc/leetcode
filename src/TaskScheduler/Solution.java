package TaskScheduler;

import java.util.*;

public class Solution {
    public int leastInterval(char[] tasks, int n) {
        Map<Character,Integer> freqMap = new HashMap<>();

        for (char ch :
                tasks) {
            freqMap.put(ch,freqMap.getOrDefault(ch,0)+1);
        }
        PriorityQueue<Integer> heap = new PriorityQueue<>(Comparator.reverseOrder());
        Deque<int[]> deque = new ArrayDeque<>();
        for (var freq:freqMap.values()) {
            heap.offer(freq);
        }

        int time=0;
        while (!heap.isEmpty() || !deque.isEmpty()) {

            if (!heap.isEmpty()) {
                time+=1;
                var cnt = heap.poll() - 1;
                if (cnt > 0) {
                    deque.offer(new int[]{cnt, time + n});
                }
            } else {
                time=deque.peek()[1];
            }
            if (!deque.isEmpty() && deque.peek()[1]<=time) {
                var cnt = deque.poll()[0] ;
                if (cnt>0)
                    heap.offer(cnt);
            }
        }
        return time;
    }
}
