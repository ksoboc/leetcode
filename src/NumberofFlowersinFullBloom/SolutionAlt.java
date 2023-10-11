package NumberofFlowersinFullBloom;

import java.util.*;

public class SolutionAlt {
    public int[] fullBloomFlowers(int[][] flowers, int[] people) {
        int[] sortedPeople = Arrays.copyOf(people,people.length);
        Arrays.sort(sortedPeople);
        Arrays.sort(flowers, Comparator.comparingInt((int[] a) -> a[0]));
        int i=0;
        PriorityQueue<Integer> heap = new PriorityQueue<>();
        Map<Integer,Integer> dayToNrOfFlowers = new HashMap<>();
        for (var day:sortedPeople) {
            while (i< flowers.length&&flowers[i][0]<=day) {
                heap.offer(flowers[i][1]);
                ++i;
            }
            while (!heap.isEmpty() && heap.peek()<day) {
                heap.poll();
            }
            dayToNrOfFlowers.put(day, heap.size());
        }
        int[] ans = new int[people.length];
        i=0;
        for (var day:people) {
            ans[i++] = dayToNrOfFlowers.get(day);
        }
        return ans;
    }

}
