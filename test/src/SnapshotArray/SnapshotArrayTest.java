package SnapshotArray;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SnapshotArrayTest {
    @Test
    void test1() {
        SnapshotArray snapshotArr = new SnapshotArray(3); // set the length to be 3
        snapshotArr.set(0,5);  // Set array[0] = 5
        var res = snapshotArr.snap();  // Take a snapshot, return snap_id = 0
        assertEquals(0,res);
        snapshotArr.set(0,6);
        res = snapshotArr.get(0,0);  // Get the value of array[0] with snap_id = 0, return 5
        assertEquals(5,res);
    }
    @Test
    void test2() {
        SnapshotArray snapshotArr = new SnapshotArray(1); // set the length to be 3
        snapshotArr.set(0,15);  // Set array[0] = 5
        var res = snapshotArr.snap();  // Take a snapshot, return snap_id = 0
        assertEquals(0,res);
        res = snapshotArr.snap();
        res = snapshotArr.snap();

        res = snapshotArr.get(0,2);
        assertEquals(15,res);
        res = snapshotArr.snap();
        res = snapshotArr.snap();

        res = snapshotArr.get(0,0);  // Get the value of array[0] with snap_id = 0, return 5
        assertEquals(15,res);
    }
    @Test
    void test3() {
        SnapshotArray snapshotArr = new SnapshotArray(1); // set the length to be 3

        var res = snapshotArr.snap();  // Take a snapshot, return snap_id = 0
        assertEquals(0,res);
        res = snapshotArr.snap();
        snapshotArr.set(0,4);  // Set array[0] = 4

        res = snapshotArr.snap();
        assertEquals(2,res);
        res = snapshotArr.get(0,1);
        assertEquals(0,res);
        snapshotArr.set(0,12);
        res = snapshotArr.snap();
        assertEquals(3,res);


        res = snapshotArr.get(0,3);  // Get the value of array[0] with snap_id = 0, return 5
        assertEquals(12,res);
    }


}