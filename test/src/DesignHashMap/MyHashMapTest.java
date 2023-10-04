package DesignHashMap;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyHashMapTest {
    @Test
    void test1() {
        MyHashMap myHashMap=new MyHashMap();
        myHashMap.put(1, 1); // The map is now [[1,1]]
        myHashMap.put(2, 2); // The map is now [[1,1], [2,2]]
        var res=myHashMap.get(1);    // return 1, The map is now [[1,1], [2,2]]
        assertEquals(1,res);
        res=myHashMap.get(3);    // return -1 (i.e., not found), The map is now [[1,1], [2,2]]
        assertEquals(-1,res);
        myHashMap.put(2, 1); // The map is now [[1,1], [2,1]] (i.e., update the existing value)
        res=myHashMap.get(2);    // return 1, The map is now [[1,1], [2,1]]
        assertEquals(1,res);
        myHashMap.remove(2); // remove the mapping for 2, The map is now [[1,1]]
        res=myHashMap.get(2);    // return -1 (i.e., not found), The map is now [[1,1]]
        assertEquals(-1,res);
    }

}