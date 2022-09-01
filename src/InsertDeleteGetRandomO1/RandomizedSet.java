package InsertDeleteGetRandomO1;

import java.util.*;

public class RandomizedSet {
    private List<Integer> list;
    private Map<Integer,Integer> map;
    public RandomizedSet() {
        list=new ArrayList<>();
        map=new HashMap<>();
    }

    public boolean insert(int val) {
        boolean res = !map.containsKey(val);
        if (res) {
            map.put(val,list.size());
            list.add(val);
        }
        return res;
    }

    public boolean remove(int val) {
        boolean res = map.containsKey(val);
        if (res) {
            var lastVal = list.get(list.size()-1);
            var idx = map.get(val);
            list.set(idx, lastVal);
            map.put(lastVal,idx);
            map.remove(val);
            list.remove(list.size()-1);
        }
        return res;
    }

    public int getRandom() {
        Random random=new Random();

        return list.get(random.nextInt(list.size()));

    }
}
