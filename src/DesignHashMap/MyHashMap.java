package DesignHashMap;

import java.util.ArrayList;
import java.util.List;

public class MyHashMap {
    private static int SIZE = 10_000;
    private List<Pair>[] buckets;
    private class Pair {
        int key;
        int val;

        public Pair(int key, int val) {
            this.key = key;
            this.val = val;
        }
    }
    public MyHashMap() {
        buckets = new List[SIZE];
    }

    public void put(int key, int value) {
        int hashcode = calcHashCode(key);
        if (buckets[hashcode]==null) {
            buckets[hashcode]=new ArrayList<>();
        }
        for (Pair pair:buckets[hashcode]) {
            if (pair.key==key) {
                pair.val=value;
                return;
            }
        }
        buckets[hashcode].add(new Pair(key,value));
    }

    private int calcHashCode(int key) {
        return (key * 31) % SIZE;
    }

    public int get(int key) {
        int hashcode = calcHashCode(key);
        if (buckets[hashcode]==null)
            return -1;
        for (var pair:buckets[hashcode]) {
            if (pair.key==key)
                return pair.val;
        }
        return -1;
    }

    public void remove(int key) {
        int hashcode = calcHashCode(key);
        if (buckets[hashcode]==null)
            return;

        for (Pair pair : buckets[hashcode]) {
            if (pair.key == key) {
                buckets[hashcode].remove(pair);
                break;
            }
        }

    }
}
