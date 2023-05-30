package DesignHashSet;

import java.util.ArrayList;
import java.util.List;

public class MyHashSet {
    private List<Integer>[] buckets;

    public MyHashSet() {
        buckets=new List[10_000];
    }

    private int hashCode(int i) {
        return i % buckets.length;
    }

    public void add(int key) {
        int hashCode = hashCode(key);
        if (buckets[hashCode]==null)
            buckets[hashCode]=new ArrayList<>();
        if (buckets[hashCode].contains(key))
            return;
        buckets[hashCode].add(key);
    }

    public void remove(int key) {
        int hashCode = hashCode(key);
        if (buckets[hashCode]==null)
            return;
        buckets[hashCode].remove(Integer.valueOf(key));
    }

    public boolean contains(int key) {
        int hashCode = hashCode(key);
        if (buckets[hashCode]==null)
            return false;
        return buckets[hashCode].contains(key);
    }
}
