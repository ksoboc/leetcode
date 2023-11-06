package SeatReservationManager;

import java.util.PriorityQueue;

public class SeatManager {
    private PriorityQueue<Integer> minPQ = new PriorityQueue<>();
    public SeatManager(int n) {
        for (int i = 1; i <= n ; i++) {
            minPQ.offer(i);
        }
    }

    public int reserve() {
        if (minPQ.isEmpty())
            return -1;
        return minPQ.poll();
    }

    public void unreserve(int seatNumber) {
        minPQ.offer(seatNumber);
    }
}
