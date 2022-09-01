package TimeBasedKeyValueStore;

import java.util.*;

public class TimeMap {
    Map<String, List<Pair>> map;

    private class Pair {
        public Pair(String value, int timestamp) {
            this.value = value;
            this.timestamp = timestamp;
        }

        String value;
        int timestamp;
    }

    public TimeMap() {
        map = new HashMap<>();
    }

    public void set(String key, String value, int timestamp) {
        var list = map.getOrDefault(key, new ArrayList<>());
        list.add(new Pair(value, timestamp));
        map.put(key, list);

    }

    public String get(String key, int timestamp) {
        var list = map.getOrDefault(key, Collections.emptyList());
        String res = "";
        int l = 0;
        int r = list.size() - 1;

        while (l <= r) {
            var m = (r + l) / 2;
            if (list.get(m).timestamp <= timestamp) {
                res = list.get(m).value;
                l = m + 1;
            } else
                r = m - 1;
        }
        return res;

    }
}
