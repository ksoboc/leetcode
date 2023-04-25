package SmallestNumberinInfiniteSet;

import java.util.HashSet;
import java.util.NavigableSet;

import java.util.Set;
import java.util.TreeSet;

public class SmallestInfiniteSet {
    private int currentInt = 1;
    private NavigableSet<Integer> added = new TreeSet<>();


    public SmallestInfiniteSet() {

    }

    public int popSmallest() {
        if (!added.isEmpty()) {
            return added.pollFirst();
        }
        return currentInt++;
    }

    public void addBack(int num) {
        if (num >= currentInt) {
            return;
        }
        added.add(num);
    }

}
