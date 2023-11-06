package SeatReservationManager;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SeatManagerTest {
    @Test
    void test1() {
        SeatManager seatManager = new SeatManager(5); // Initializes a SeatManager with 5 seats.
        var seat = seatManager.reserve();    // All seats are available, so return the lowest numbered seat, which is 1.
        assertEquals(1, seat);
        seat = seatManager.reserve();    // The available seats are [2,3,4,5], so return the lowest of them, which is 2.
        assertEquals(2, seat);
        seatManager.unreserve(2); // Unreserve seat 2, so now the available seats are [2,3,4,5].
        seat = seatManager.reserve();    // The available seats are [2,3,4,5], so return the lowest of them, which is 2.
        assertEquals(2, seat);
        seat = seatManager.reserve();    // The available seats are [3,4,5], so return the lowest of them, which is 3.
        assertEquals(3, seat);
        seat = seatManager.reserve();    // The available seats are [4,5], so return the lowest of them, which is 4.
        assertEquals(4, seat);
        seat = seatManager.reserve();    // The only available seat is seat 5, so return 5.
        assertEquals(5, seat);
        seatManager.unreserve(5);
    }

}