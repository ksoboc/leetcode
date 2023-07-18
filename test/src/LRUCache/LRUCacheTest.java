package LRUCache;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LRUCacheTest {
    @Test
    void test1() {
        LRUCache lRUCache = new LRUCache(2);
        lRUCache.put(1, 1); // cache is {1=1}
        lRUCache.put(2, 2); // cache is {1=1, 2=2}
        var res = lRUCache.get(1);    // return 1
        assertEquals(1,res);
        lRUCache.put(3, 3); // LRU key was 2, evicts key 2, cache is {1=1, 3=3}
        res=lRUCache.get(2);    // returns -1 (not found)
        assertEquals(-1,res);
        lRUCache.put(4, 4); // LRU key was 1, evicts key 1, cache is {4=4, 3=3}
        res=lRUCache.get(1);    // return -1 (not found)
        assertEquals(-1,res);
        res=lRUCache.get(3);    // return 3
        assertEquals(3,res);
        res=lRUCache.get(4);    // return 4
        assertEquals(4,res);
    }

}