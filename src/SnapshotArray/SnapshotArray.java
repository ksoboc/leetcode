package SnapshotArray;

import java.util.ArrayList;
import java.util.List;
import java.util.NavigableMap;
import java.util.TreeMap;

public class SnapshotArray {

    private List<NavigableMap<Integer,Integer>> snapShot;
    private int snapId;

    public SnapshotArray(int length) {
        snapShot = new ArrayList<>();
        snapId = 0;
        for (int i = 0; i < length; i++) {
            snapShot.add(new TreeMap<>());
            snapShot.get(i).put(0,0);
        }
    }

    public void set(int index, int val) {
        var list = snapShot.get(index);
        list.put(snapId,val);
    }

    public int snap() {
        return snapId++;
    }

    public int get(int index, int snap_id) {
        var list = snapShot.get(index);
        return list.floorEntry(snap_id).getValue();
    }
}
