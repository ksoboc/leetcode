package HandofStraights;

import java.util.*;

public class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        if (hand.length % groupSize != 0)
            return false;
        Map<Integer, Integer> map = new HashMap<>();
        for (var n : hand) {
            map.merge(n, 1, (old, val) -> old + val);
        }
        PriorityQueue<Integer> heap = new PriorityQueue<>(map.keySet());
        while (!heap.isEmpty()) {
            var first = heap.peek();
            for (int i = first; i < first + groupSize; i++) {
                if (!map.containsKey(i))
                    return false;
                map.merge(i, 0, (old, val) -> old <= 1 ? null : old - 1);
                if (map.get(i) == null) {
                    if (heap.peek() != i)
                        return false;
                    heap.poll();
                }
            }
        }
        return true;

    }

    public boolean isNStraightHandTM(int[] hand, int groupSize) {
        if (hand.length % groupSize != 0)
            return false;
        NavigableMap<Integer,Integer> map = new TreeMap<>();
        for (var n : hand) {
            map.merge(n, 1, (old, val) -> old + val);
        }
        while (!map.isEmpty()) {
            var first = map.firstEntry().getKey();
            for (int i = first; i < first + groupSize; i++) {
                if (!map.containsKey(i))
                    return false;
                map.merge(i, 0, (old, val) -> old <= 1 ? null : old - 1);
            }
        }
        return true;
    }
}
