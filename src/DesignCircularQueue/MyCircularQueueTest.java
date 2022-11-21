package DesignCircularQueue;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyCircularQueueTest {
    @Test
    void test1() {
        MyCircularQueue myCircularQueue = new MyCircularQueue(3);
        assertTrue(myCircularQueue.enQueue(1));; // return True
        assertTrue(myCircularQueue.enQueue(2));; // return True
        assertTrue(myCircularQueue.enQueue(3));; // return True
        assertFalse(myCircularQueue.enQueue(4));; // return False
        assertEquals(3,myCircularQueue.Rear());;     // return 3

        assertTrue(myCircularQueue.isFull());;   // return True
        assertTrue(myCircularQueue.deQueue());;  // return True
        assertTrue(myCircularQueue.enQueue(4));; // return True
        assertEquals(4,myCircularQueue.Rear());;     // return 4
    }

//    ["MyCircularQueue","enQueue","Front","enQueue","Rear","enQueue","enQueue","Rear","deQueue","Front","deQueue","Front"]
//            [[7],[0],[],[4],[],[6],[3],[],[],[],[],[]]

    @Test
    void test2() {
        MyCircularQueue myCircularQueue = new MyCircularQueue(7);
        assertTrue(myCircularQueue.enQueue(0));; // return True
        assertEquals(0,myCircularQueue.Front());;
        assertTrue(myCircularQueue.enQueue(4));; // return True
        assertEquals(4,myCircularQueue.Rear());
        assertTrue(myCircularQueue.enQueue(6));; // return True
        assertTrue(myCircularQueue.enQueue(3));
        assertEquals(3,myCircularQueue.Rear());
        assertTrue(myCircularQueue.deQueue());
        assertEquals(4,myCircularQueue.Front());
        assertTrue(myCircularQueue.deQueue());
        assertEquals(6,myCircularQueue.Front());

    }
}