package FindMedianfromDataStream;

import java.util.Comparator;
import java.util.PriorityQueue;

public class MedianFinder {
    private PriorityQueue<Integer> above;
    private PriorityQueue<Integer> below;

    public MedianFinder() {
        above = new PriorityQueue<>();
        below = new PriorityQueue<>(Comparator.reverseOrder());
    }

    public void addNum(int num) {
        if (above.size()== below.size()) {
            if (!below.isEmpty() && num< below.peek()) {
                above.offer(below.poll());
                below.offer(num);

            } else {
                above.offer(num);
            }
        } else {
            // above.size = below.size+1
            if (num> above.peek()) {
                below.offer(above.poll());
                above.offer(num);

            } else {
                below.offer(num);
            }
        }

    }

    public double findMedian() {
        if (above.isEmpty())
            return 0.0;
        if (below.size() < above.size()) {
            return above.peek();
        }
        return ((double)above.peek() + below.peek())/2.0;

    }
}
