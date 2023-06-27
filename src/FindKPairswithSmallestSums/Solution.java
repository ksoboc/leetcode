package FindKPairswithSmallestSums;

import java.util.*;

public class Solution {
    public List<List<Integer>> kSmallestPairs(int[] nums1, int[] nums2, int k) {
        List<List<Integer>> res = new ArrayList<>();
        int idx1 = 0;
        int idx2 = 0;
        int numPairs = 0;
        Comparator<int[]> comp = Comparator.comparingInt(a -> nums1[a[0]] + nums2[a[1]]);
        PriorityQueue<int[]> pq = new PriorityQueue<>(comp);
        pq.offer(new int[]{0,0});

        Set<List<Integer>> visited = new HashSet<>();

        while (numPairs < k && !pq.isEmpty()) {
            var list = pq.poll();
            idx1=list[0];
            idx2=list[1];
            res.add(List.of(nums1[idx1], nums2[idx2]));
            ++numPairs;

            if (idx1 + 1 < nums1.length && !visited.contains(List.of(idx1 + 1, idx2))) {
                pq.offer(new int[]{idx1 + 1, idx2});
                visited.add(List.of(idx1 + 1, idx2));
            }
            if (idx2 + 1 < nums2.length && !visited.contains(List.of(idx1, idx2 + 1))) {
                pq.offer(new int[]{idx1, idx2 + 1});
                visited.add(List.of(idx1, idx2 + 1));
            }
        }
        return res;
    }
}
