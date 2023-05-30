package DesignHashSet;

public class MyHashSetAlt {
    private boolean[] present;

    public MyHashSetAlt() {
        present = new boolean[1_000_001];
    }

    public void add(int i) {
        present[i] = true;
    }

    public void remove(int i) {
        present[i] = false;
    }

    public boolean contains(int i) {
        return present[i];
    }
}
