package TopKFrequentWords;

import java.util.*;

public class Solution {
    public List<String> topKFrequent(String[] words, int k) {
        // map hold the word: counts
        final HashMap<String, Integer> map = new HashMap();

        Comparator<Map.Entry<String, Integer>> comp = Comparator.comparingInt(Map.Entry<String, Integer>::getValue)
                .thenComparing((a, b) -> b.getKey().compareTo(a.getKey()));
        // sort the map by frequency high->low order, sort words lexi order
        PriorityQueue<Map.Entry<String, Integer>> heap = new PriorityQueue<>(comp);

        // fill the map
        for (String word : words) {
            map.merge(word, 1, Integer::sum);
        }

        // put into heap
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            heap.offer(entry);
            if (heap.size() > k)
                heap.poll();
        }

        // pop out the answer
        List<String> ans = new LinkedList<>();
        while (!heap.isEmpty())
            ans.add(0,heap.poll().getKey());



        return ans;
    }
}
