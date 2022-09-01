package LRUCache;

import java.util.LinkedHashMap;
import java.util.Map;

public class LRUCache {
    class MyLinkedHashMap<K, V> extends LinkedHashMap<K, V> {

        private final int maxEnties;

        public MyLinkedHashMap(int capacity) {
            super(capacity, .75f, true);
            maxEnties=capacity;
        }

        @Override
        protected boolean removeEldestEntry(Map.Entry eldest) {
            return size() > maxEnties;
        }

    }

    MyLinkedHashMap<Integer,Integer> hashMap;
    public LRUCache(int capacity) {
        hashMap = new MyLinkedHashMap<Integer, Integer>(capacity);
    }

    public int get(int key) {
        return hashMap.getOrDefault(key, -1);
    }

    public void put(int key, int value) {
        hashMap.put(key,value);
    }

}
