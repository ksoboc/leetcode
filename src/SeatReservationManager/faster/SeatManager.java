package SeatReservationManager.faster;

import java.util.PriorityQueue;

public class SeatManager {
    private PriorityQueue<Integer> minPQ;
    private int marker;
    public SeatManager(int n) {
        marker=1;
        minPQ=new PriorityQueue<>();
    }

    public int reserve() {
        if (minPQ.isEmpty())
            return marker++;
        return minPQ.poll();
    }

    public void unreserve(int seatNumber) {

        minPQ.offer(seatNumber);
    }
}
